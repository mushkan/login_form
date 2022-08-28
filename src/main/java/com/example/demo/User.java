package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	//using generated security password: 7eea09e9-f798-44d2-b2b9-0da354c55973
	
	@Id()
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="firstName",nullable=false)
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="email",nullable=false,unique=true)
	private String email;
	
	@Column(name="password")
	private String password;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
