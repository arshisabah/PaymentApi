package com.example.demo;

public class OrderService {
    public void placeOrder() {
        var paymentService = new StripePaymentService();
        paymentService.processPayment(100.0);
    }
}
