package com.coreym.springreactProject.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.coreym.springreactProject.models.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long> {

	ArrayList<Movie> findAll();
	
	
}
