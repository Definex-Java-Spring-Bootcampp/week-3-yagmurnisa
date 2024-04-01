package com.patika.invoiceservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.patika.invoiceservice.model.Invoice;
import com.patika.invoiceservice.service.InvoiceService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/invoices")
public class InvoiceController {
	@Autowired
	private InvoiceService invoiceService;

	@GetMapping
	public List<Invoice> getInvoiceByUser(@RequestBody Long id) {
		return invoiceService.getInvoiceByUser(id);
	}

}
