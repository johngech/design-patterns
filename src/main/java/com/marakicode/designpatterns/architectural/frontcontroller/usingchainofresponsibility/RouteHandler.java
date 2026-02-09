package com.marakicode.designpatterns.architectural.frontcontroller.usingchainofresponsibility;

public class RouteHandler extends Handler {
    private final Route route;

    public RouteHandler(Handler next, Route route) {
        super(next);
        this.route = route;
    }

    @Override
    protected boolean shouldFilter(Request request) {
        var controller = route.resolve(request.getPath());
        controller.process(request);
        return false;
    }
}
