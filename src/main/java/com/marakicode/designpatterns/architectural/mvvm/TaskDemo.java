package com.marakicode.designpatterns.architectural.mvvm;

public class TaskDemo {
    public static void test(){
        var viewModel = new TaskViewModel();
        viewModel.addTask(new TaskModel(1,"Task 1",true));
        viewModel.addTask(new TaskModel(2,"Task 2",true));
        viewModel.addTask(new TaskModel(3,"Task 3",false));

        var view = new TaskView(viewModel);
        view.render();
    }
}
