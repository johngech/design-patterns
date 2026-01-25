package com.marakicode.designpatterns.behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ListHistoryStorage<T> implements HistoryStorage<T> {
    private final List<T> items = new ArrayList<>();

    @Override
    public void add(T item) {
        items.add(item);
    }

    @Override
    public T removeLast() {
        var lastItem = items.getLast();
        items.remove(lastItem);
        return lastItem;
    }

    @Override
    public T get(int index) {
        return items.get(index);
    }

    @Override
    public int size() {
        return items.size();
    }
}
