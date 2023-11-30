package com.coreym.mvcdemo.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coreym.mvcdemo.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	public ArrayList<User> findAll();
	
}
