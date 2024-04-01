package com.patika.customerservice.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.patika.customerservice.model.Customer;


public class CustomerRepository {

	 private List<Customer> customerList = new ArrayList<>();

	 public Customer save(Customer customer) {
		 customerList.add(customer);
		 return customer;
	 }

	public List<Customer> getAll() {
		return customerList;
	}
	
	public Optional<Customer> getCustomerById(Long id) {
		return customerList.stream()
				.filter(user -> user.getId().equals(id))
                .findFirst();
	}
}

