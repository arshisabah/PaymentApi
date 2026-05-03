package com.example.demo;

public class StoreApplication {
    public static void main(String[] args) {
        var OrderService = new OrderService(new PaypalPaymentService());
        OrderService.placeOrder();
    }
}
