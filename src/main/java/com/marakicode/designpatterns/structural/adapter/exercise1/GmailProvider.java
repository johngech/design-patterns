package com.marakicode.designpatterns.structural.adapter.exercise1;

import com.marakicode.designpatterns.structural.adapter.exercise1.fx.Gmail;

public class GmailProvider implements EmailProvider {
    private final Gmail gmail;

    public GmailProvider(Gmail gmail) {
        this.gmail = gmail;
    }

    @Override
    public void send(String message) {
        gmail.init();
        gmail.send(message);
    }
}
