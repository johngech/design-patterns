package com.marakicode.designpatterns.architectural.frontcontroller.usingchainofresponsibility;

public class AuthorizationHandler extends Handler {
    public AuthorizationHandler(Handler next) {
        super(next);
    }

    @Override
    protected boolean shouldFilter(Request request) {
        System.out.println("Authorizing: " + request.getPath());
        return true;
    }
}
