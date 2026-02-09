package com.marakicode.designpatterns.creational.factorymethod.exercise1;

public class TestScheduler {
    public static void test() {
        Scheduler scheduler = new JulianScheduler();
        scheduler.schedule(new Task());
        scheduler = new GregorianScheduler();
        scheduler.schedule(new Task());

    }
}
