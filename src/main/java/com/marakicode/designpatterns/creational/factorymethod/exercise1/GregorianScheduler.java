package com.marakicode.designpatterns.creational.factorymethod.exercise1;

public class GregorianScheduler extends Scheduler {
    @Override
    protected Calendar createCalendar() {
        return new GregorianCalendar();
    }
}
