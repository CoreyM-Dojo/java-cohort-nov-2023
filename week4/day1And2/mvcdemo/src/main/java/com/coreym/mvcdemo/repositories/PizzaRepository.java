package com.coreym.mvcdemo.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coreym.mvcdemo.models.Pizza;

@Repository
public interface PizzaRepository extends CrudRepository<Pizza, Long> {
	
	ArrayList<Pizza> findAll();
	
}
