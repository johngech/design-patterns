package com.marakicode.designpatterns.architectural.frontcontroller.usingchainofresponsibility;

public class RateLimitHandler extends Handler {
    public RateLimitHandler(Handler next) {
        super(next);
    }

    @Override
    protected boolean shouldFilter(Request request) {
        System.out.println("Rate Limit Checked.");
        return true;
    }
}
