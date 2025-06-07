package com.appserv.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class AppConfig {
    @Value("${payment.service}")
    private String paymentservice;

    @Bean
    public PaymentService stripe(){

        return new StripePaymentService();
    }

    @Bean
    public PaymentService paypal(){
        return new PaypalPaymentService();
    }

    @Bean
    public OrderService orderService(){
        if( paymentservice.equals("stripe") ){
            return new OrderService(paypal());
        }
        else{
        return new OrderService(stripe());
        }
    }
}

