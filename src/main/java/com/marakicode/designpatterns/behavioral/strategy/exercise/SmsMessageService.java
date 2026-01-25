package com.marakicode.designpatterns.behavioral.strategy.exercise;

public class SmsMessageService implements MessageService {
    @Override
    public void send(String message) {
        System.out.println("Sending message using sms: " + message);
    }
}
