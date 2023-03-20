package com.example.springjpawebapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springjpawebapplication.model.User;
import com.example.springjpawebapplication.services.UserService;

@RestController
@CrossOrigin("*")
public class UserController {

	public UserController(@Autowired UserService userService) {
		this.userService = userService;

	}

	private final UserService userService;

	@GetMapping("/user/{id}")
	public User getUser(@PathVariable Integer id) {
		return userService.getUser(id);

	}

	@PostMapping("/user")
	public User newUser(@RequestBody User user) {
		return userService.save(user);
	}

	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable Integer id) {
		userService.delete(id);

	}

	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		return userService.save(user);
	}
}
