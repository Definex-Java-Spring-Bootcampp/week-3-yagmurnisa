package com.patika.orderservice.model;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Product {
	
	Long id;
	String name;
	Long price;
}

