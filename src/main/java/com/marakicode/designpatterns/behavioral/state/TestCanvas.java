package com.marakicode.designpatterns.behavioral.state;

import com.marakicode.designpatterns.behavioral.state.abuse.Stopwatch;

public class TestCanvas {
    public static void test(){
        var canvas = new Canvas(new EraserTool());
        canvas.mouseUp();
        canvas.mouseDown();

        var stopwatch = new Stopwatch();
        stopwatch.click();
        stopwatch.click();
        stopwatch.click();
    }
}
