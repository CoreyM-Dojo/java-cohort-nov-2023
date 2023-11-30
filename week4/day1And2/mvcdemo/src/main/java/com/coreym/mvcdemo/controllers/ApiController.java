package com.coreym.mvcdemo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coreym.mvcdemo.models.Pizza;
import com.coreym.mvcdemo.models.User;
import com.coreym.mvcdemo.services.PizzaService;
import com.coreym.mvcdemo.services.UserService;

@RestController
public class ApiController {
	
	@Autowired
	public PizzaService service;
	
	@Autowired
	public UserService uService;
	
	@PostMapping("/api/pizzas")
	public Pizza createPizza(
			@RequestParam(value="pizzaType") String pizzaType,
			@RequestParam(value="pizzaSize") String pizzaSize,
			@RequestParam(value="numOfToppings") Integer toppings
			) {
		
		Pizza newPizza = new Pizza(pizzaType, pizzaSize, toppings);
		
		return service.createPizza(newPizza);
		
	}
	
	@GetMapping("/api/pizzas")
	public ArrayList<Pizza> getAllPizzas(Model model) {
		ArrayList<Pizza> allPizzas = service.all();
		model.addAttribute("pizzas", allPizzas);
		return service.all();
	}
	
	@GetMapping("/api/pizzas/by-size/{size}")
	public ArrayList<Pizza> getBySize(@PathVariable(value="size") String pizzaSize) {
		return service.findPizzasBySize(pizzaSize);
	}
	
	@GetMapping("/api/users")
	public ArrayList<User> getAllUsers() {
		return uService.all();
	}
	
	
}
