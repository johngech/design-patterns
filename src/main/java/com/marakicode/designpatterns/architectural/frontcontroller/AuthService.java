package com.marakicode.designpatterns.architectural.frontcontroller;

public class AuthService {
    public boolean isAuthenticated(Request request) {
        return request.getAccessToken() != null;
    }
}
