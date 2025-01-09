package com.empresa.circuitbreaker.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class PaymentRepositoryImpl implements PaymentRepository {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String processPayment() {
        restTemplate.getForEntity("https://www.google.com", String.class);
        return "Pago procesado correctamente";
    }
}
