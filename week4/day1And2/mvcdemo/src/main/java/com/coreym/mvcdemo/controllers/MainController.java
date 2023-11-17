package com.coreym.mvcdemo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		String[] toppingsChoices = {"pepperoni", "sausage", "salami", "pineapple", "bacon", "mushrooms", "green peppers", "chicken"};
		String[] pizzaSizes = {"Small", "Medium", "Large", "Extra Large"};
		model.addAttribute("toppingsChoices", toppingsChoices);
		model.addAttribute("pizzaSizes", pizzaSizes);
		return "index.jsp";
	}
	
	@GetMapping("/pizzas/{id}")
	public String displayPizza (Model model, @PathVariable Long id, RedirectAttributes redirectAttributes) {
		Pizza onePizza = pizzaService.findOne(id);
		
		if (onePizza == null) {
			redirectAttributes.addFlashAttribute("noPizza", "Pizza was not found");
			return "redirect:/";
		}
		
		for (String topping : onePizza.getToppings()) {
			
			System.out.println(topping);
		}
		
		model.addAttribute("pizza", onePizza);
		
		return "display.jsp";
		
	}
	
	@PostMapping("/pizzas")
	public String processCreatePizza(@Valid @ModelAttribute Pizza pizza, BindingResult result, Model model) {
		
		// @Valid -> Attaches to the model attribute and makes sure the user input matches validations
		// @ModelAttribute -> uses the binded data object within this request
		// BindingResult -> holds the form data 
		
		
		
		if (result.hasErrors()) {
			String[] toppingsChoices = {"pepperoni", "sausage", "salami", "pineapple", "bacon", "mushrooms", "green peppers", "chicken"};
			String[] pizzaSizes = {"Small", "Medium", "Large", "Extra Large"};
			model.addAttribute("toppingsChoices", toppingsChoices);
			model.addAttribute("pizzaSizes", pizzaSizes);
			return "index.jsp";
		}
		
		pizza.setNumOfToppings(pizza.getToppings().length);
		
		pizzaService.createPizza(pizza);
		return "redirect:/";
	}
	
	@GetMapping("/pizzas/edit/{id}")
	public String editPizzaForm(@PathVariable Long id, RedirectAttributes redirectAttributes, Model model) {
		Pizza pizzaToUpdate = pizzaService.findOne(id);
		
		if (pizzaToUpdate == null) {
			redirectAttributes.addFlashAttribute("noPizza", "Pizza was not found");
			return "redirect:/";
		}
		
		String[] toppingsChoices = {"pepperoni", "sausage", "salami", "pineapple", "bacon", "mushrooms", "green peppers", "chicken"};
		String[] pizzaSizes = {"Small", "Medium", "Large", "Extra Large"};
		model.addAttribute("toppingsChoices", toppingsChoices);
		model.addAttribute("pizzaSizes", pizzaSizes);
		
		model.addAttribute("pizza", pizzaToUpdate);
		return "edit.jsp";
	}
	
	@PutMapping("/pizzas/{id}")
	public String updatePizza(@Valid @ModelAttribute Pizza pizza, BindingResult result, @PathVariable Long id, Model model  ) {
		
		if (result.hasErrors()) {
			String[] toppingsChoices = {"pepperoni", "sausage", "salami", "pineapple", "bacon", "mushrooms", "green peppers", "chicken"};
			String[] pizzaSizes = {"Small", "Medium", "Large", "Extra Large"};
			model.addAttribute("toppingsChoices", toppingsChoices);
			model.addAttribute("pizzaSizes", pizzaSizes);
			return "edit.jsp";
		}
		pizza.setNumOfToppings(pizza.getToppings().length);
		pizzaService.updatePizza(pizza);
		return "redirect:/";
	}
	
	@DeleteMapping("/pizzas/{id}")
	public String deletePizza(@PathVariable Long id) {
		pizzaService.deletePizza(id);
		return "redirect:/";
	}

}
