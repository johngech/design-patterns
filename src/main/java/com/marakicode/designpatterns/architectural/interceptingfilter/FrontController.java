package com.marakicode.designpatterns.architectural.interceptingfilter;

// Client Identifier

public class FrontController {
    private final FilterManager manager;

    public FrontController(FilterManager manager) {
        this.manager = manager;
    }

    public void handleRequest(Request request) {
        manager.handleRequest(request);
    }
}
