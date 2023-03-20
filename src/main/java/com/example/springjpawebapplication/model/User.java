package com.example.springjpawebapplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "User")
public class User {

	@Id
	@GeneratedValue
	private int id;
	@Column(name = "name")
	private String name;
	private String Email;
    
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	public User() {
		super();
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

}