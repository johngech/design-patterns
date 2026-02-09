package com.marakicode.designpatterns.architectural.frontcontroller;

// Every incoming request passes throw this front controller

public class FrontController {
    private final AuthService authService;
    private final Logger logger;
    private final Route route;

    public FrontController(AuthService authService, Logger logger, Route route) {
        this.authService = authService;
        this.logger = logger;
        this.route = route;
    }

    public void process(Request request) {
//        1. Logging
        logger.log(request);

//        2. Authentication
        if (!authService.isAuthenticated(request)) {
            System.out.println("Unauthorized request");
            return;
        }
//        3. Resolve controllers
        var controller = route.resolve(request.getPath());
//        4. Delegate processing
        controller.process(request);
    }
}
