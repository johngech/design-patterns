package com.marakicode.designpatterns.structural.adapter.exercise1.fx;

public class Yahoo {
    public void init() {

    }

    public void send(String message) {
        System.out.println("Provider: Yahoo");
        System.out.println("Message: " + message);
    }
}
