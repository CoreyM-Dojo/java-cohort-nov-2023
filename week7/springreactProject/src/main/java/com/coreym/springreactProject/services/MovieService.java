package com.coreym.springreactProject.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coreym.springreactProject.models.Movie;
import com.coreym.springreactProject.repositories.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository repo;

	public ArrayList<Movie> all() {
		return repo.findAll();
	}
	
	public Movie create(Movie movie) {
		return repo.save(movie);
	}
	
	public Movie find(Long id) {
		return repo.findById(id).orElse(null);
	}
	public Movie update(Movie movie) {
		return repo.save(movie);
	}
	
	public void destroy(Long id) {
		repo.deleteById(id);
	}
	
	
}
