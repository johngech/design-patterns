package com.marakicode.designpatterns.structural.adapter.exercise1;

public class Outlook implements EmailProvider {
    @Override
    public void send(String message) {
        System.out.println("Provider: Outlook");
        System.out.println("message: " + message);
    }
}
