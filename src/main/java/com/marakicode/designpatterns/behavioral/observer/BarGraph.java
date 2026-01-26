package com.marakicode.designpatterns.behavioral.observer;

public class BarGraph<T> implements Observer {
    private final DataSource<T> dataSource;

    public BarGraph(DataSource<T> dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Notify BarGraph when value: " + dataSource.getValue() + " changes");
    }
}
