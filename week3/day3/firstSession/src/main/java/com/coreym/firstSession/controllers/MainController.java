package com.coreym.firstSession.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	
	
	@GetMapping("/") 
	public String index(HttpSession session) {
//		System.out.println(session.isNew());
//		session.setAttribute("myFavWord", "flubbernuggets");
		ArrayList<String> pies = new ArrayList<>();
		pies.add("My pie");
		session.setAttribute("pies", pies);
		return "index.jsp";
	}
	
	@PostMapping("/process")
	public String process(
			@RequestParam("secret") String secret, 
			@RequestParam("secretNumber") Integer secretNumber, 
			RedirectAttributes redirectAttributes,
			HttpSession session) {
		
		if (secretNumber < 10) {
			redirectAttributes.addFlashAttribute("error", "Nah thats too small");
			return "redirect:/";
		}
		session.setAttribute("secret", secret);
		session.setAttribute("secretNum", secretNumber);
		return "redirect:/display";
	}
	
	@GetMapping("/display")
	public String display(Model model, HttpSession session) {
		String secretWord = session.getAttribute("secret").toString();
		Integer secretNumber = (Integer) session.getAttribute("secretNumber");
		ArrayList<String> pies = (ArrayList<String>)session.getAttribute("pies");
		System.out.println(pies.get(0));
		model.addAttribute("secret", secretWord);
		model.addAttribute("secretNum", secretNumber);
		return "display.jsp";
	}
	
	@GetMapping("/word")
	public String myWord(HttpSession session) {
		System.out.println(session.getAttribute("myFavWord"));
		System.out.println(session.getAttribute("myFavNumber"));
		return "index.jsp";
	}

}
