package com.ahvshiro.store.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahvshiro.store.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Adalberto Pereira", "adalberto@mail.com", "44 98765-4321", "6D%TW!OG(YW@788@2o");
		return ResponseEntity.ok().body(u);
	}
}
