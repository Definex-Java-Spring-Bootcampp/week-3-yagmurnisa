package com.patika.orderservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.patika.orderservice.model.Order;
import com.patika.orderservice.model.Product;
import com.patika.orderservice.service.OrderService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/orders")
@RequiredArgsConstructor
public class OrderController {
	
	private final OrderService orderService;
	
	@PostMapping
	public Order createOrder(@RequestBody Order order) {
		return orderService.createOrder(order);
	}
	
	@GetMapping
	public List<Order> getOrderByUser(@RequestBody Long id) {
		return orderService.getOrderByUser(id);
	}

}
