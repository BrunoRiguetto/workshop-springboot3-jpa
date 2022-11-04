package com.gft.courseNelio.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gft.courseNelio.entities.User;

@RestController
@RequestMapping(value = "api/v1/users")
public class UserController {

	@GetMapping
	public ResponseEntity<User> findAll() {
		return null;
	}
	
}
