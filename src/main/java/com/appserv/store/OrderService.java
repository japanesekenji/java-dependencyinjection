package com.appserv.store;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;

//@Service
public class OrderService {
    private PaymentService paymentService;


    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("Order Service created");
    }

    @PostConstruct
    public void init() {
        System.out.println("Order Service constructed");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Order Service destroyed");
    }

    public void placeOrder(){
        //var paymentService = new ();
        paymentService.processPayment(10);
    }
}
