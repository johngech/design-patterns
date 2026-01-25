package com.marakicode.designpatterns.behavioral.strategy.exercise;

public class TestChatClient {
    public static void test(){
//        var chatClient = new ChatClient(
//                new BcryptMessageEncoder(),
//                new SmsMessageService()
//        );
//
//        chatClient.chat("Hey there");

        var chatClient = new ChatClient();
        chatClient.chat("Hi there!",
                new YesMessageEncoder(),
                new EmailMessageService()
        );

        chatClient.chat("Hi there!",
                new BcryptMessageEncoder(),
                new EmailMessageService()
        );
    }
}
