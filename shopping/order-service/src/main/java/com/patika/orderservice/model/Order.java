package com.patika.orderservice.model;

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
	Long price;
	Long customerId;
	List<Product> products;
}
