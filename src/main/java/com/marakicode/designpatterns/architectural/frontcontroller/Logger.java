package com.marakicode.designpatterns.architectural.frontcontroller;

public class Logger {
    public void log(Request request) {
        System.out.println("Logging request: " + request.getPath());
    }
}
