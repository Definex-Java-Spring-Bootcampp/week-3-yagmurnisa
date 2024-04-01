package com.patika.invoiceservice.dto;

import java.util.List;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Order {
	Long id;
	Long customerId;
	String customerName;
	List<Product> products;
	Long price;
}