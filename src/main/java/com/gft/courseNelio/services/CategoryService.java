package com.gft.courseNelio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gft.courseNelio.entities.Category;
import com.gft.courseNelio.repositories.CategoryRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategoryService {

	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		
		Optional<Category> obj = repository.findById(id);
		
		return obj.get();
	}
}
