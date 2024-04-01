package com.patika.orderservice.model;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Product {
	
	long id;
	String name;
	double price;
}

