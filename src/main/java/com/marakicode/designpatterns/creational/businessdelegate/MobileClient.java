package com.marakicode.designpatterns.creational.businessdelegate;

public class MobileClient {
    private final BusinessDelegate delegate;

    public MobileClient(BusinessDelegate delegate) {
        this.delegate = delegate;
    }

    public void play(String name) {
        delegate.doTask(name);
    }
}
