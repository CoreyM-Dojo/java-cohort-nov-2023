package com.coreym.mvcdemo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coreym.mvcdemo.models.User;
import com.coreym.mvcdemo.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	
	public ArrayList<User> all() {
		return userRepo.findAll();
	}
	
	public User findOne(Long id) {
		return userRepo.findById(id).orElse(null);
	}
	
	public User createUser(User user) {
		return userRepo.save(user);
	}
	
	
	// Update -> uses repo.save(User)
	// checks for a property specifically called id
	public User updateUser(User user) {
		return userRepo.save(user);
	}
	
	// Delete
	public void deleteUser(Long id) {
		userRepo.deleteById(id);
	}

}
