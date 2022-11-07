package com.gft.courseNelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gft.courseNelio.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
