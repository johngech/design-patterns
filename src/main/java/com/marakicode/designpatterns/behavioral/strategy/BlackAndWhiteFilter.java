package com.marakicode.designpatterns.behavioral.strategy;

public class BlackAndWhiteFilter implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Applying black and with filter to: " + fileName);
    }
}
