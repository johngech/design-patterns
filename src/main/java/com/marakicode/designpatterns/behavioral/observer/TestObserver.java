package com.marakicode.designpatterns.behavioral.observer;

public class TestObserver {
    public static void test() {
        var dataSource = new DataSource<String>();
        dataSource.addObserver(new SpreadSheet<>(dataSource));
        dataSource.addObserver(new Chart<>(dataSource));
        dataSource.addObserver(new BarGraph<>(dataSource));

        dataSource.setValue("a");
    }
}
