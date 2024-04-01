package com.patika.customerservice.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.patika.customerservice.dto.CustomerDTO;
import com.patika.customerservice.model.Customer;
import com.patika.customerservice.service.CustomerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/customers")
@RequiredArgsConstructor
public class CustomerController {
	
	private final CustomerService customerService;

	@PostMapping
	public CustomerDTO createCustomer(@RequestBody Customer request) {
		return customerService.createCustomer(request);
	}

	@GetMapping
	public List<Customer> getAll() {
		return customerService.getAll();
	}
	
}
