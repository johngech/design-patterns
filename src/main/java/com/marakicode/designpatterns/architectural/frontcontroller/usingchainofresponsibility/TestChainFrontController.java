package com.marakicode.designpatterns.architectural.frontcontroller.usingchainofresponsibility;

public class TestChainFrontController {
    public static void test() {
        var router = new Router();
        var routeHandler = new RouteHandler(null, router);
        var authorize = new AuthorizationHandler(routeHandler);
        var auth = new AuthenticationHandler(authorize);
        var rateLimit = new RateLimitHandler(auth);
        var logger = new LoggingHandler(rateLimit);
        var frontController = new FrontController(logger);
        frontController.handleRequest(new Request("/users", "#@$@#sa;lh"));
        frontController.handleRequest(new Request("/products", "#@$@#sa;lh"));
        frontController.handleRequest(new Request("/admin", null));
    }
}
