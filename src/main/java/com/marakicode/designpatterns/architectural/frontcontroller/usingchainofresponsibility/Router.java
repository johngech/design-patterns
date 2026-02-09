package com.marakicode.designpatterns.architectural.frontcontroller.usingchainofresponsibility;

public class Router implements Route {
    @Override
    public Controller resolve(String path) {
        return switch (path) {
            case "/users" -> new UserController();
            case "/products" -> new ProductController();
            case "/admin" -> new AdminController();
            default -> new HomeController();
        };
    }
}
