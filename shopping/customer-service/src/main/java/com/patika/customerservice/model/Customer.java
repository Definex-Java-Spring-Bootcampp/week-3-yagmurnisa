package com.patika.customerservice.model;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Customer {

	Long Id;
	String name;
	String password;
	String email;
	int age;
}
