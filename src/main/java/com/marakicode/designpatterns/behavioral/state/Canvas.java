package com.marakicode.designpatterns.behavioral.state;

// Context
public class Canvas {
    private Tool currentTool;

    public Canvas(Tool tool) {
        this.currentTool = tool;
    }

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public void mouseDown() {
        currentTool.mouseDown();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
