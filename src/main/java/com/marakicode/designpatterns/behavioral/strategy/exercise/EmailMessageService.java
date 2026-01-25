package com.marakicode.designpatterns.behavioral.strategy.exercise;

public class EmailMessageService implements MessageService {
    @Override
    public void send(String message) {
        System.out.println("Sending message using email: " + message);
    }
}
