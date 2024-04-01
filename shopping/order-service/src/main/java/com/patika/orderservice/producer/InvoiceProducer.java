package com.patika.orderservice.producer;

import com.patika.orderservice.configuration.RabbitMQConfiguration;
import com.patika.orderservice.model.Order;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class InvoiceProducer {

    // private final RabbitTemplate rabbitTemplate;

    private final RabbitMQConfiguration rabbitMQConfiguration;
    private final AmqpTemplate amqpTemplate;

    public void sendOrderInfo(Order order) {
        log.info("Order information sent: {}", order);
        amqpTemplate.convertSendAndReceive(rabbitMQConfiguration.getExchange(), rabbitMQConfiguration.getRoutingkey(), order);
    }

}
