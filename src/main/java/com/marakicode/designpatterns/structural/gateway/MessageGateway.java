package com.marakicode.designpatterns.structural.gateway;

public class MessageGateway implements Gateway {
    @Override
    public void execute() {
        System.out.println("Message Gateway");
    }
}
