package com.ketul.resource;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ketul.module.User;

@RestController
public class UserResource {
	
	@PostMapping("/")
	public User validdateUser(@Valid @RequestBody  User user) {
		return user;
	}
}
