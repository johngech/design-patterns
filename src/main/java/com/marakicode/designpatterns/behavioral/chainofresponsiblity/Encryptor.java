package com.marakicode.designpatterns.behavioral.chainofresponsiblity;

public class Encryptor extends Handler{
    public Encryptor(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(HttpRequest request) {
        System.out.println("Encrypt");
        return false;
    }
}
