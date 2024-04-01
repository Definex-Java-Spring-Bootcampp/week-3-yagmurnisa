package com.patika.invoiceservice.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.patika.invoiceservice.dto.Order;
import com.patika.invoiceservice.service.InvoiceService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class InvoiceListener {

	private InvoiceService invoiceService;
	
    @RabbitListener(queues = "${rabbitmq.queue}")
    public void sendOrderInfo(Order order) {
    	invoiceService.createInvoice(order);
        log.info("kuyruktan okudun: {}", order);
        
    }
}