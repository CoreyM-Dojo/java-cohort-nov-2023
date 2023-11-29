package com.coreym.mvcdemo.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.coreym.mvcdemo.models.Topping;

public interface ToppingRepository extends CrudRepository<Topping, Long>{
	
	ArrayList<Topping> findAll();

}
