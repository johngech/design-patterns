package com.marakicode.designpatterns.behavioral.Iterator;

public interface HistoryStorage<T> {
    void add(T item);

    T removeLast();

    T get(int index);

    int size();
}
