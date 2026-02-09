package com.marakicode.designpatterns.creational.factorymethod.exercise1;

public class JulianScheduler extends Scheduler {
    @Override
    protected Calendar createCalendar() {
        return new JulianCalendar();
    }
}
