package com.gft.courseNelio.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gft.courseNelio.entities.User;
import com.gft.courseNelio.repositories.UserRepository;

import lombok.AllArgsConstructor;

@Configuration
@Profile("test")
@AllArgsConstructor
public class TestConfig implements CommandLineRunner{
	
	private UserRepository userRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
}
