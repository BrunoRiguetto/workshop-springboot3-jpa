package com.gft.courseNelio.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gft.courseNelio.entities.Order;
import com.gft.courseNelio.services.OrderService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "api/v1/orders")
@AllArgsConstructor
public class OrderResource {

	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		
		List<Order> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		
		Order obj = service.findById(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
}
