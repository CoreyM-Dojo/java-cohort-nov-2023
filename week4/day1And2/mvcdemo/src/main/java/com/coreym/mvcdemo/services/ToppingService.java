package com.coreym.mvcdemo.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.coreym.mvcdemo.models.Topping;
import com.coreym.mvcdemo.repositories.ToppingRepository;

@Service
public class ToppingService {

private final ToppingRepository repo;
	
	public ToppingService(ToppingRepository toppingRepo) {
		this.repo = toppingRepo;
	}
	
	public ArrayList<Topping> all() {
		return repo.findAll();
	}
	
	public Topping findOne(Long id) {
		return repo.findById(id).orElse(null);
	}
	
	public Topping createTopping(Topping pizza) {
		return repo.save(pizza);
	}
	
	
	// Update -> uses repo.save(Topping)
	// checks for a property specifically called id
	public Topping updateTopping(Topping pizza) {
		return repo.save(pizza);
	}
	
	// Delete
	public void deleteTopping(Long id) {
		repo.deleteById(id);
	}
}
