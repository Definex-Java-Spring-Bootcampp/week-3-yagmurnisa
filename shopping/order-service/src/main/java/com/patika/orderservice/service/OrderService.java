package com.patika.orderservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.patika.orderservice.model.Order;
import com.patika.orderservice.model.Product;
import com.patika.orderservice.repository.OrderRepository;

@Service
public class OrderService {

	public OrderRepository repository = new OrderRepository();
	
	public List<Order> getOrderByUser(Long id) {
		return repository.getOrderByUser(id);
	}
	
	public Order createOrder(Order order) {
		return repository.save(order);
	}
	
}
