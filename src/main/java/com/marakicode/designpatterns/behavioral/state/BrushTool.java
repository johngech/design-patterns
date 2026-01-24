package com.marakicode.designpatterns.behavioral.state;

// Leonardo Divencci: Simplicity is the ultimate sophistication

public class BrushTool extends Tool {
    @Override
    public void mouseUp() {
        System.out.println("Brush Icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw a line");
    }
}
