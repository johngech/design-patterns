package com.marakicode.designpatterns.architectural.mvc;

import java.util.ArrayList;
import java.util.List;

public class TaskController {
    final private List<TaskModel> tasks = new ArrayList<>();
    final private TaskView view = new TaskView();

    public void addTask(TaskModel task) {
        tasks.add(task);
    }

    public boolean removeTask(int id) {
        return tasks.removeIf(task -> task.id() == id);
    }

    public void showTasks(){
        tasks.forEach(view::render);
    }
}
