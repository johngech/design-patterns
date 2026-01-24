package com.marakicode.designpatterns.architectural.mvp;

public class TaskDemo {
    public static void test(){
        var view = new ConsoleTaskView();
        var presenter = new TaskPresenter(view);
        presenter.addTask(new TaskModel(1,"Task 1",false));
        presenter.addTask(new TaskModel(2,"Task 2",true));
        presenter.present(); // show task
    }
}
