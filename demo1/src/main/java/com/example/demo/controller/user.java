package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@PostMapping("/add")
	public String addUser(@RequestBody UserModel allUser) {
		
		return userservices.saveUser(allUser);			
	}
	@PutMapping("/update")
	public String updateuser(@RequestBody UserModel newUser) {
		
		return userservices.updateUser(newUser);		
	}
	@GetMapping("/user/{id}")
	public UserModel findUser(@PathVariable Integer id){
		
		return userservices.findById(id);
	}
}
