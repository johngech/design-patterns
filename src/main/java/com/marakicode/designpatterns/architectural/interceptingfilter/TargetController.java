package com.marakicode.designpatterns.architectural.interceptingfilter;


public class TargetController {
    public void handleRequest(Request request) {
        System.out.println("Processing request for target: " + request.getPath());
    }
}
