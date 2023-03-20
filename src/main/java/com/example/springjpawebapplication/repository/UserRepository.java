package com.example.springjpawebapplication.repository;

import org.springframework.data.repository.CrudRepository;


import com.example.springjpawebapplication.model.User;


public interface UserRepository extends CrudRepository<User, Integer>{

	
	
}
