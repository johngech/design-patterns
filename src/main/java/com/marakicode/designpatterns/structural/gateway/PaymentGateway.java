package com.marakicode.designpatterns.structural.gateway;

public class PaymentGateway implements Gateway{
    @Override
    public void execute() {
        System.out.println("Payment Gateway");
    }
}
