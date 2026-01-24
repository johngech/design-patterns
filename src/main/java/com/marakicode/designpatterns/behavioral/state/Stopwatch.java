package com.marakicode.designpatterns.behavioral.state;

public class Stopwatch {
    private boolean isRunning = false;

    public void click() {
        if (isRunning) {
            isRunning = false;
            System.out.println("Stopped");
        } else {
            isRunning = true;
            System.out.println("Running");
        }
    }
}
