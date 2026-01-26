package com.marakicode.designpatterns.behavioral.observer;

public class SpreadSheet<T> implements Observer {
    private final DataSource<T> dataSource;

    public SpreadSheet(DataSource<T> dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Notify SpreadSheet when value: " + dataSource.getValue() + " changes");
    }
}
