package com.gft.courseNelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gft.courseNelio.entities.OrderItem;
import com.gft.courseNelio.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
