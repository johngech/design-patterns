package com.marakicode.designpatterns.architectural.mvc;

public class TaskDemo {
    public static void test(){
        var controller = new TaskController();
        controller.addTask(new TaskModel(1,"Task 1",false));
        controller.addTask(new TaskModel(2,"Task 2",true));
        controller.showTasks();
    }
}
