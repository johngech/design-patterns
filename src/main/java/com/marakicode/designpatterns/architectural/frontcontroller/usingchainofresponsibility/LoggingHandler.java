package com.marakicode.designpatterns.architectural.frontcontroller.usingchainofresponsibility;

public class LoggingHandler extends Handler {
    public LoggingHandler(Handler next) {
        super(next);
    }

    @Override
    protected boolean shouldFilter(Request request) {
        System.out.println("Logging: " + request.getPath());
        return true;
    }
}
