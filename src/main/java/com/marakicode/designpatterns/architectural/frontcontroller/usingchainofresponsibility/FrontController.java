package com.marakicode.designpatterns.architectural.frontcontroller.usingchainofresponsibility;

public class FrontController {
    private final Handler handler;

    public FrontController(Handler handler) {
        this.handler = handler;
    }

    public void handleRequest(Request request) {
        handler.handle(request);
    }

    public Handler getHandler() {
        return handler;
    }
}
