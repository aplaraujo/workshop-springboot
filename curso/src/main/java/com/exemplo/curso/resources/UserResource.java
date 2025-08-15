package com.exemplo.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User user = new User(1L, "Luzia Gabriela Ferreira", "luzia_ferreira@santosdumonthospital.com", "(67) 3559-0855", "3RFlhHY5d9");
		return ResponseEntity.ok().body(user);
	}
}
