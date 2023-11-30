package com.coreym.mvcdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
		
		if (result.hasErrors()) {
			return "auth/registration.jsp";
		}
		
		User newUser = userService.createUser(user);
		session.setAttribute("loggedInUser", newUser.getId());
		return "redirect:/";
	}
}
