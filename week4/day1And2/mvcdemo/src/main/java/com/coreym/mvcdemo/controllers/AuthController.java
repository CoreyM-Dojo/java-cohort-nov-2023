package com.coreym.mvcdemo.controllers;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coreym.mvcdemo.models.LoginUser;
import com.coreym.mvcdemo.models.User;
import com.coreym.mvcdemo.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/auth")
public class AuthController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/registration")
	public String registrationPage(@ModelAttribute(value="user") User user) {
		return "auth/registration.jsp";
	}
	
	@PostMapping("/registration")
	public String register(@Valid @ModelAttribute(value="user") User user, BindingResult result, HttpSession session) {
		
		System.out.println(result);
		
		// Check if email is unique
		if (userService.getByEmail(user.getEmail()) != null) {
			result.rejectValue("email", "uniqueEmail", "Email is already taken");
		}
		
		if (!user.getPassword().equals(user.getConfirmPassword())) {
			result.rejectValue("password", "passwordMatch", "Password must match Confirm Password");
		}
		
		if (result.hasErrors()) {
			return "auth/registration.jsp";
		}
		user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()));
		User newUser = userService.createUser(user);
		session.setAttribute("loggedInUser", newUser.getId());
		
		return "redirect:/";
	}
	
	@GetMapping("/login") 
	public String loginForm(@ModelAttribute("loginObj") LoginUser loginUser) {
		return "/auth/login.jsp";
	}
	
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute(value="loginObj") LoginUser loginUser, BindingResult result, HttpSession session) {
		
		if (result.hasErrors()) {
			return "/auth/login.jsp";
		}
		
		User userFromDb = userService.getByEmail(loginUser.getEmail());
		
		if (userFromDb == null) {
			result.rejectValue("email", "invalid", "Invalid login");
			return "/auth/login.jsp";
		}
		
		if (!BCrypt.checkpw(loginUser.getPassword(), userFromDb.getPassword())) {
			result.rejectValue("email", "invalid", "invalid login");
			return "/auth/login.jsp";
		}
		
		session.setAttribute("loggedInUser", userFromDb.getId());
		return "redirect:/";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/auth/login";
	}
}
