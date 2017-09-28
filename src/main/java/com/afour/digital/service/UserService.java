package com.afour.digital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.afour.digital.model.User;
import com.afour.digital.repository.IUserRepository;

@Service
public class UserService implements IUserService {
	
	@Autowired
	IUserRepository userRepo;
	
	
	public List<User> getAllusers() {
		return userRepo.findAll();
	}

	
	public User getuserById(int userId) {
		return userRepo.findByUserId(userId);
	}

	
	public void adduser(User user) {
		userRepo.save(user);
	}

	
	public void updateuser(User user) {
		
	}

	
	public void deleteuser(int userId) {
		
	}

	
}
