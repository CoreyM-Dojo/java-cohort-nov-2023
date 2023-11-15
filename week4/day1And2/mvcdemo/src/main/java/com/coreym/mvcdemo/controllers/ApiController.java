package com.coreym.mvcdemo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coreym.mvcdemo.models.Pizza;
import com.coreym.mvcdemo.services.PizzaService;

@RestController
public class ApiController {
	
	@Autowired
	public PizzaService service;
	
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
	public ArrayList<Pizza> getAllPizzas() {
		return service.all();
	}
	
	
}
