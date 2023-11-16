package com.coreym.mvcdemo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.coreym.mvcdemo.models.Pizza;
import com.coreym.mvcdemo.services.PizzaService;

import jakarta.validation.Valid;

@Controller
public class MainController {
	
	@Autowired
	public PizzaService pizzaService;
	
	@GetMapping("/")
	public String home(@ModelAttribute Pizza pizza, Model model) {
		// @ModelAttribute - creates an empty Pizza object to attach to our form
		ArrayList<Pizza> allPizzas = pizzaService.all();
		model.addAttribute("allPizzas",allPizzas);
		return "index.jsp";
	}
	
	@GetMapping("/pizzas/{id}")
	public String displayPizza (Model model, @PathVariable Long id, RedirectAttributes redirectAttributes) {
		Pizza onePizza = pizzaService.findOne(id);
		
		if (onePizza == null) {
			redirectAttributes.addFlashAttribute("noPizza", "Pizza was not found");
			return "redirect:/";
		}
		
		model.addAttribute("pizza", onePizza);
		
		return "display.jsp";
		
	}
	
	@PostMapping("/pizzas")
	public String processCreatePizza(@Valid @ModelAttribute Pizza pizza, BindingResult result) {
		
		// @Valid -> Attaches to the model attribute and makes sure the user input matches validations
		// @ModelAttribute -> uses the binded data object within this request
		// BindingResult -> holds the form data 
		
		if (result.hasErrors()) {
			return "index.jsp";
		}
		
		pizzaService.createPizza(pizza);
		return "redirect:/";
	}

}
