package com.coreym.mvcdemo.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.coreym.mvcdemo.models.Pizza;
import com.coreym.mvcdemo.repositories.PizzaRepository;

@Service
public class PizzaService {
	
	private final PizzaRepository repo;
	
	public PizzaService(PizzaRepository pizzaRepo) {
		this.repo = pizzaRepo;
	}
	
	public ArrayList<Pizza> all() {
		return repo.findAll();
	}
	
	public Pizza findOne(Long id) {
		return repo.findById(id).orElse(null);
	}
	
	public Pizza createPizza(Pizza pizza) {
		return repo.save(pizza);
	}
	
	
	
	

}