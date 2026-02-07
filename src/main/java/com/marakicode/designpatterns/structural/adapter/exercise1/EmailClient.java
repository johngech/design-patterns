package com.marakicode.designpatterns.structural.adapter.exercise1;

public class EmailClient {
    private final EmailProvider provider;

    public EmailClient(EmailProvider provider) {
        this.provider = provider;
    }

    public void send(String content) {
        provider.send(content);
    }
}
