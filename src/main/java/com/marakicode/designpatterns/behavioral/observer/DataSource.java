package com.marakicode.designpatterns.behavioral.observer;

public class DataSource<T> extends Subject {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
        notifyObservers();
    }

}
