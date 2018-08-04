package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.UserModel;


public interface UserRepository extends JpaRepository<UserModel,Integer> {

}
