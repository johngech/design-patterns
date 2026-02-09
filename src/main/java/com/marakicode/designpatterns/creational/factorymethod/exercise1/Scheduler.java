package com.marakicode.designpatterns.creational.factorymethod.exercise1;


public abstract class Scheduler {

    protected abstract Calendar createCalendar();

    public void schedule(Task task) {
        var calendar = createCalendar();
        System.out.println("Schedule Event Using: " + calendar.getCalendarType());
    }
}
