package com.patika.customerservice.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CustomerDTO {

	Long Id;
	String name;
	String email;
	int age;
}