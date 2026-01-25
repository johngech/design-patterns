package com.marakicode.designpatterns.behavioral.strategy.exercise;

public class YesMessageEncoder implements MessageEncoder {
    @Override
    public String encode(String message) {
        System.out.println("Encoding message using YesCrypt Algorithm");
        return "$y$j9$()sdgkjag&^%$&";
    }
}
