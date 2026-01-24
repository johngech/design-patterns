package com.marakicode.designpatterns.behavioral.state;

public class SelectionTool extends Tool {
    @Override
    public void mouseUp() {
        System.out.println("Selection Icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw a dashed rectangle");
    }
}
