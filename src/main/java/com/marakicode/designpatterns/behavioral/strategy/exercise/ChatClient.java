package com.marakicode.designpatterns.behavioral.strategy.exercise;

public class ChatClient {
//    private final MessageEncoder encoder;
//    private final MessageService service;
//
//    public ChatClient(MessageEncoder encoder, MessageService service) {
//        this.encoder = encoder;
//        this.service = service;
//    }
//
//    public void chat(String message){
//        var encodedMessage = encoder.encode(message);
//        service.send(encodedMessage);
//    }

    public void chat(String message, MessageEncoder encoder, MessageService service) {
        var encodedMessage = encoder.encode(message);
        service.send(encodedMessage);
    }
}
