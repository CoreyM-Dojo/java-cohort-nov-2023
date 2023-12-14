package com.coreym.springreactProject.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.coreym.springreactProject.models.Movie;
import com.coreym.springreactProject.models.Review;
import com.coreym.springreactProject.services.MovieService;
import com.coreym.springreactProject.services.ReviewService;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("/api")
public class ApiController {
	
	@Autowired
	private MovieService mService;
	@Autowired
	private ReviewService rService;
	
	@GetMapping("")
//	@ResponseBody
	public String index() {
		return "Welcome to the MovieDB API";
	}
	
	@GetMapping("/movies")
	public ArrayList<Movie> allMovies() {
		return mService.all();
	}
	
	@GetMapping("/movies/{id}")
	@ResponseBody
	public Movie getMovie(@PathVariable("id") Long id) {
		return mService.find(id);
		
	}
	
	@PostMapping(path="/movies", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public Movie createMovie(@RequestBody Movie requestBody) {
		return mService.create(requestBody);
	}
	@PutMapping(path="/movies", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public Movie updateMovie(@RequestBody Movie requestBody) {
		return mService.update(requestBody);
	}
	
	@DeleteMapping("/movies")
	public String deleteMovie(@RequestBody Movie movie) {
		mService.destroy(movie.getId());
		return "Movie successfully deleted with id: " + movie.getId();
	}
	
	// Reviews
	
	@GetMapping(path="/reviews/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Review getReview(@PathVariable("id") Long id) {
		return rService.find(id);
	}

	@PostMapping(path="/reviews", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public Review createReview(@RequestBody Review requestBody) {
		return rService.create(requestBody);
	}
	@PutMapping(path="/reviews", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public Review updateReview(@RequestBody Review requestBody) {
		return rService.update(requestBody);
	}
	
	@DeleteMapping("/reviews")
	public String deleteReview(@RequestBody Review review) {
		rService.destroy(review.getId());
		return "Review successfully deleted with id: " + review.getId();
	}
	
	
	
	
	
}
