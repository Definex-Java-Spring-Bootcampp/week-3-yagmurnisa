package com.patika.invoiceservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.patika.invoiceservice.dto.Order;
import com.patika.invoiceservice.model.Invoice;
import com.patika.invoiceservice.repository.InvoiceRepository;

@Service
public class InvoiceService {
	
	private InvoiceRepository invoiceRepository = new InvoiceRepository();
	
	public void createInvoice(Order order) {
		Invoice invoice = Invoice.builder().order(order).build();
		invoiceRepository.save(invoice);
	}
	
	public List<Invoice> getInvoiceByUser(Long id) {
		List<Invoice> invoices = invoiceRepository.getInvoiceByUser(id);
		return invoices;
	}
}
