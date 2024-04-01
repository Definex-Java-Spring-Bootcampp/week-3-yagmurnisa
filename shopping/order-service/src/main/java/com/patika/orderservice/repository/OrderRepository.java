package com.patika.orderservice.repository;

import java.util.ArrayList;
import java.util.List;

import com.patika.orderservice.model.Order;

public class OrderRepository {

	List<Order> orders = new ArrayList();
	
	public List<Order> getOrderByUser(Long id) {
		return orders.stream().filter(o -> o.getCustomerId().equals(id)).toList();
	}
	
	public Order save(Order order) {
		orders.add(order);
		return order;
	}
}
