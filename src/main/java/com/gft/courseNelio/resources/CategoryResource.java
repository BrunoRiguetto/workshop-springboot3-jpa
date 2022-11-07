package com.gft.courseNelio.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gft.courseNelio.entities.Category;
import com.gft.courseNelio.services.CategoryService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "api/v1/categories")
@AllArgsConstructor
public class CategoryResource {

	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		
		List<Category> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		
		Category obj = service.findById(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
}
