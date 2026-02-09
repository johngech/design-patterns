package com.marakicode.designpatterns.architectural.interceptingfilter;

public class LoggingFilter implements Filter {
    @Override
    public boolean shouldFilter(Request request) {
        System.out.println("Logging: " + request.getPath());
        return true; // always continue
    }
}
