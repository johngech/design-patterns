package com.marakicode.designpatterns.behavioral.observer;

public class Chart<T> implements Observer {
    private final DataSource<T> dataSource;

    public Chart(DataSource<T> dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Notify Chart when value: " + dataSource.getValue() + " changes");
    }
}
