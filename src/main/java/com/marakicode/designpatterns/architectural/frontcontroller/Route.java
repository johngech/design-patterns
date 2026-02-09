package com.marakicode.designpatterns.architectural.frontcontroller;

// Dispatcher (Central point for all request)

public class Route {
    public Controller resolve(String path) {
        return switch (path) {
            case "/account" -> new AccountController();
            case "/transfer" -> new TransferController();
            case "/laon" -> new LoanController();
            default -> throw new RuntimeException();
        };
    }
}
