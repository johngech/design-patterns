package com.marakicode.designpatterns.structural.gateway;

public class OtherGateway implements Gateway {
    @Override
    public void execute() {
        System.out.println("Other Gateway");
    }
}
