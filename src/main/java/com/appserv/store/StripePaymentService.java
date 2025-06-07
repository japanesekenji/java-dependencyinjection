package com.appserv.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;


//@Service("stripe")
public class StripePaymentService implements PaymentService {

    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.timeout:3000}")
    private int timeout;

    @Value("${stripe.supported-currencies}")
    private List<String> SupportedCurrencies;

    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("Api URL: " + apiUrl);
        System.out.println("Enabled: " + enabled);
        System.out.println("Timeout: " + timeout);
        System.out.println("SupportedCurrencies: " + SupportedCurrencies);
        System.out.println("Amount "+ amount);
    }
}
