package com.coreym.mvcdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coreym.mvcdemo.models.Pizza;
import com.coreym.mvcdemo.models.Topping;
import com.coreym.mvcdemo.services.PizzaService;
import com.coreym.mvcdemo.services.ToppingService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/toppings")
public class ToppingController {
	
	@Autowired
	private PizzaService pService;
	
	@Autowired
	private ToppingService tService;

	@GetMapping("")
	public String toppingForm(@ModelAttribute(value="topping") Topping topping, Model model) {
		List<Pizza> allPizzas = pService.all();
		model.addAttribute("allPizzas", allPizzas);
		return "/toppings/createTopping.jsp";
	}
	
	@PostMapping("")
	public String createTopping(@Valid @ModelAttribute("topping") Topping topping, BindingResult result, Model model) {
		
		if (result.hasErrors()) {
			List<Pizza> allPizzas = pService.all();
			model.addAttribute("allPizzas", allPizzas);
			return "/toppingscreateTopping.jsp";
		}
		tService.createTopping(topping);
		return "redirect:/toppings";
	}
}
