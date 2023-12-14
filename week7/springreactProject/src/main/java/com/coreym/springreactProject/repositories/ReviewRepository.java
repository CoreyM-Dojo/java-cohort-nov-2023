package com.coreym.springreactProject.repositories;

import org.springframework.data.repository.CrudRepository;

import com.coreym.springreactProject.models.Review;

public interface ReviewRepository extends CrudRepository<Review, Long> {

	
}
