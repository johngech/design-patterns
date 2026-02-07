package com.marakicode.designpatterns.structural.adapter.exercise1.fx;

// Adaptee
public class Gmail {
    public void init() {

    }

    public void send(String message) {
        System.out.println("Provider: Gmail");
        System.out.println("Message: " + message);
    }
}
