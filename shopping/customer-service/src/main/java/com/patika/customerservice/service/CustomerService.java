package com.patika.customerservice.service;

import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.patika.customerservice.exceptions.*;
import com.patika.customerservice.dto.CustomerDTO;
import com.patika.customerservice.model.Customer;
import com.patika.customerservice.repository.CustomerRepository;

import lombok.RequiredArgsConstructor;

@Service

public class CustomerService {
	
	private CustomerRepository customerRepository = new CustomerRepository();

	public CustomerDTO createCustomer(Customer customer) {
		customerRepository.save(customer);
		return convertCustomertoDTO(customer);
	}
	
	public List<CustomerDTO> getAll() {
		List<Customer> customers = customerRepository.getAll();
		return customers.stream().map(this::convertCustomertoDTO).toList();
	}
	
	public CustomerDTO getCustomerById(Long id) {
		 Optional<Customer> foundCustomer = customerRepository.getCustomerById(id);
		 Customer customer = foundCustomer.orElseThrow(() -> new CustomerException(ExceptionMessages.USER_NOT_FOUND));
		 return convertCustomertoDTO(customer);
	}
	
	private CustomerDTO convertCustomertoDTO(Customer customer) {
		return CustomerDTO.builder()
				.age(customer.getAge())
				.Id(customer.getId())
				.name(customer.getName()).build();
	}
}
