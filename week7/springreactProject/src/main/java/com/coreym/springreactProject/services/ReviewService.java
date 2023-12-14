package com.coreym.springreactProject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coreym.springreactProject.models.Review;
import com.coreym.springreactProject.repositories.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository repo;
	
	public Review find(Long id) {
		return repo.findById(id).orElse(null);
	}

	public Review create(Review review) {
		return repo.save(review);
	}
	public Review update(Review review) {
		return repo.save(review);
	}
	
	public void destroy(Long id) {
		repo.deleteById(id);
	}
	
	
}
