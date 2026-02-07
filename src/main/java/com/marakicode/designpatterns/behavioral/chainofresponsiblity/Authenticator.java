package com.marakicode.designpatterns.behavioral.chainofresponsiblity;

import java.util.Objects;

public class Authenticator extends Handler {
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(HttpRequest request) {
        var isValid = (
                Objects.equals(request.getUsername(), "admin") &&
                        Objects.equals(request.getPassword(), "1234")
        );
        System.out.println("Authentication");
        return !isValid;
    }
}
