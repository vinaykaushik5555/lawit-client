package com.lawit.client.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lawit.client.models.User;

@RestController("/lawit-client")
public class UserResource {
	
	@PostMapping
	
	public ResponseEntity<User> createUser(){
		return null;
		
	}

}
