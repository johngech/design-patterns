package com.marakicode.designpatterns.architectural.mvp;

import java.util.ArrayList;
import java.util.List;

public class TaskPresenter {
    private final List<TaskModel> tasks = new ArrayList<>();
    private final TaskView view;

    public TaskPresenter(TaskView view) {
        this.view = view;
    }

    public void addTask(TaskModel task){
        tasks.add(task);
    }

    public boolean removeTask(int id){
        return tasks.removeIf(task->task.id() == id);
    }

    public void present(){
        tasks.forEach(view::render);
    }
}
