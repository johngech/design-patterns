package com.marakicode.designpatterns.architectural.frontcontroller.usingchainofresponsibility;

public abstract class Handler {
    private final Handler next;

    protected Handler(Handler next) {
        this.next = next;
    }

    public void handle(Request request) {
        if (!shouldFilter(request)) {
            // Stop chain if handler refuses to process
            return;
        }
        if (next == null)
            return;

        // If everything is ok,pass the next filter in the list
        next.handle(request);
    }

    // Return false to stop chain
    protected abstract boolean shouldFilter(Request request);
}
