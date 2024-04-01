package com.patika.invoiceservice.model;

import com.patika.invoiceservice.dto.Order;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Invoice { //db de farklı olmalı

	Order order;
}
