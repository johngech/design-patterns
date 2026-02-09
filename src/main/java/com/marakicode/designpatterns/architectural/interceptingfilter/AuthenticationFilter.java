package com.marakicode.designpatterns.architectural.interceptingfilter;

public class AuthenticationFilter implements Filter {
    @Override
    public boolean shouldFilter(Request request) {
        System.out.println("Authenticating: " + request.getPath());
        boolean authorized = request.getAccessToken() != null;
        if (!authorized) {
            System.out.println("Unauthorized");
            return false;
        }

        return true;
    }
}
