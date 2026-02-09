package com.marakicode.designpatterns.architectural.frontcontroller;

public class TestFrontController {
    public static void test() {
        var logger = new Logger();
        var authService = new AuthService();
        var route = new Route();
        var frontController = new FrontController(authService, logger, route);
        frontController.process(new Request("/account", "*^&fajkl543#$%"));
        frontController.process(new Request("/transfer", "*^&fajkl543#$%"));
        frontController.process(new Request("/loan", null));
    }
}
