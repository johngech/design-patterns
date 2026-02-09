package com.marakicode.designpatterns.architectural.interceptingfilter;

public class CompressionFilter implements Filter {
    @Override
    public boolean shouldFilter(Request request) {
        System.out.println("Compressing response for: " + request.getPath());
        return true;
    }
}
