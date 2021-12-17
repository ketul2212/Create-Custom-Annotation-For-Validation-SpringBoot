package com.ketul.module;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.ketul.annotation.PasswordAnnotation;

public class User {

	@NotNull
	@Pattern(regexp = "(^[A-Z])\\w+", message = "Your Name should contain 1st capital letter")
	private String name;
	
	@NotNull
	@Min(value = 10, message = "Your age is > 10")
	@Max(value = 30, message = "Your age is < 30")
	private String age;
	
	@NotNull
	private String email;
	
	@NotNull
	@PasswordAnnotation()
	private String pass;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", email=" + email + ", pass=" + pass + "]";
	}
}
