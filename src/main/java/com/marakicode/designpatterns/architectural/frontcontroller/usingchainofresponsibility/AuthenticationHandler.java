package com.marakicode.designpatterns.architectural.frontcontroller.usingchainofresponsibility;

public class AuthenticationHandler extends Handler {
    public AuthenticationHandler(Handler next) {
        super(next);
    }

    @Override
    protected boolean shouldFilter(Request request) {
        System.out.println("Authenticating: " + request.getPath());
        if (request.getAccessToken() == null) {
            System.out.println("Unauthorized");
            return false; // Stop chain
        }
        return true;
    }
}
