package com.example.demo.services;

import java.util.List;

import com.example.demo.model.UserModel;

public interface UserServices {
	
	public List<UserModel> findAllUsers();

	public String saveUser(UserModel allUser);

	public String updateUser(UserModel newUser);

	public UserModel findById(Integer id);

	
}
