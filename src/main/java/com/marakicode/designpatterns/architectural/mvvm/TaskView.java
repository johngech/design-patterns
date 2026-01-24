package com.marakicode.designpatterns.architectural.mvvm;

public class TaskView {
    private final TaskViewModel viewModel;

    public TaskView(TaskViewModel viewModel) {
        this.viewModel = viewModel;
    }

    public void render(){
        viewModel.tasks()
                .forEach(System.out::println);
    }
}
