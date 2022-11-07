package com.gft.courseNelio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gft.courseNelio.entities.Product;
import com.gft.courseNelio.repositories.ProductRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductService {

	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		
		Optional<Product> obj = repository.findById(id);
		
		return obj.get();
	}
}
