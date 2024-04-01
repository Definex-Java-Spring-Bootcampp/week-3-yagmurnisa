package com.patika.customerservice.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.patika.customerservice.dto.CustomerDTO;
import com.patika.customerservice.model.Customer;
import com.patika.customerservice.repository.CustomerRepository;

import lombok.RequiredArgsConstructor;

@Service

public class CustomerService {
	
	private CustomerRepository customerRepository = new CustomerRepository();

	public CustomerDTO createCustomer(Customer customer) {
		customerRepository.save(customer);
		return CustomerDTO.builder()
				.age(customer.getAge())
				.Id(customer.getId())
				.name(customer.getName()).build();
	}
	public List<Customer> getAll() {
		return customerRepository.getAll();
	}

}
