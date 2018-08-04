package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserModel;
import com.example.demo.services.UserServices;

@RestController
public class user {
	@Autowired
	private UserServices userservices;
	
	@GetMapping("/users")
	public List<UserModel> getAllUsers() {
		
		return userservices.findAllUsers();
	}
	
}
