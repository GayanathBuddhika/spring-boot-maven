package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="user")
public class UserModel {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name ="user_id")
	private Integer id;
	
	@Column(name ="first_name")
	private String first_name;

	@Column(name ="last_name")
	private String last_name;

	@Column(name ="age")
	private Integer age;
	
	

	public UserModel() {
	
		
	}
	
	
	public UserModel(int id, String first_name, String last_name, int age) {
	
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
