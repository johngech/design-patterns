package com.marakicode.designpatterns.architectural.mvp;

public class ConsoleTaskView implements TaskView {
    @Override
    public void render(TaskModel task) {
        System.out.println(task);
    }
}
