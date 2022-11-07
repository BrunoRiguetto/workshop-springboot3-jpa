package com.gft.courseNelio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gft.courseNelio.entities.Order;
import com.gft.courseNelio.repositories.OrderRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OrderService {

	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		
		Optional<Order> obj = repository.findById(id);
		
		return obj.get();
	}
}
