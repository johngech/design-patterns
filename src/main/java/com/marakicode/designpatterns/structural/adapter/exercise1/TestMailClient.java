package com.marakicode.designpatterns.structural.adapter.exercise1;

import com.marakicode.designpatterns.structural.adapter.exercise1.fx.Gmail;

public class TestMailClient {
    public static void test() {
//        var client = new EmailClient(new Outlook());
//        var client = new EmailClient(new GmailProvider(new Gmail()));
        var client = new EmailClient(new YahooProvider());
        client.send("Hello world");
    }
}
