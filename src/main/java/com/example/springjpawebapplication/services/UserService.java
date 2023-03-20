package com.example.springjpawebapplication.services;

import com.example.springjpawebapplication.model.User;

public interface UserService {

	
	User getUser(Integer id);
	User save(User user);
	void delete(Integer id);
	
}