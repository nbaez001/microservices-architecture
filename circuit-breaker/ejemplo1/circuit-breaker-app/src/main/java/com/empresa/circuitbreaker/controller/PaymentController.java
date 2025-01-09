package com.empresa.circuitbreaker.controller;

import com.empresa.circuitbreaker.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/processPayment")
    public String processPayment() {
        return paymentService.processPayment();
    }
}
