package com.gft.courseNelio.entities;

import java.io.Serializable;

import com.gft.courseNelio.entities.pk.OrderItemPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private OrderItemPK id;
	
	private Integer quantity;
	
	private Double price;

	public OrderItem(Order order, Product product, Integer quantity, Double price) {
		id.setOrder(order);
		id.setOrder(order);
		this.quantity = quantity;
		this.price = price;
	}	
	
	public Order getOrder() {
		return id.getOrder();
	}
	
	public void setOrder(Order order) {
		id.setOrder(order);
	}
	
	public Product getProduct() {
		return id.getProduct();
	}
	
	public void setProduct(Product product) {
		id.setProduct(product);
	}
}
