package com.marakicode.designpatterns.architectural.mvvm;

import java.util.ArrayList;
import java.util.List;

public class TaskViewModel {
    private final List<TaskModel> tasks = new ArrayList<>();

    public void addTask(TaskModel task) {
        tasks.add(task);
    }

    public boolean removeTask(int id) {
        return tasks.removeIf(task -> task.id() == id);
    }

    public List<TaskModel> tasks() {
        return tasks;
    }
}
