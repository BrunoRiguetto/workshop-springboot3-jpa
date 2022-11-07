package com.gft.courseNelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gft.courseNelio.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
