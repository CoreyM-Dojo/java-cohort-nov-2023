package com.coreym.mvcdemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coreym.mvcdemo.models.Pizza;
import com.coreym.mvcdemo.models.Topping;
import com.coreym.mvcdemo.repositories.PizzaRepository;
import com.coreym.mvcdemo.repositories.ToppingRepository;

@Service
public class PizzaMakerService {

	@Autowired
	PizzaRepository pRepo;
	
	@Autowired
	ToppingRepository tRepo;
	
	
	public Pizza addToppingsToPizza(Long pizzaId, Long toppingId) {
		Pizza onePizza = pRepo.findById(pizzaId).orElse(null);
		Topping oneTopping = tRepo.findById(toppingId).orElse(null);
		onePizza.getToppings().add(oneTopping);
		return pRepo.save(onePizza);
	}
}
