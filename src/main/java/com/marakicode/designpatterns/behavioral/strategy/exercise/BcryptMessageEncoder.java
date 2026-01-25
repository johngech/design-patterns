package com.marakicode.designpatterns.behavioral.strategy.exercise;

public class BcryptMessageEncoder implements MessageEncoder {
    @Override
    public String encode(String message) {
        System.out.println("Encoding message using Bcrypt Algorithm");
        return "alh05270shl*&^%&";
    }
}
