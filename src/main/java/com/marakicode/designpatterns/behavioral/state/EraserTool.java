package com.marakicode.designpatterns.behavioral.state;

// ConcreteState

public class EraserTool extends Tool{
    @Override
    public void mouseUp() {
        System.out.println("Eraser Icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Erase something...");
    }
}
