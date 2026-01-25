package com.marakicode.designpatterns.behavioral.Iterator;

public class HistoryIterator<T> implements Iterator<T> {
    private final HistoryStorage<T> storage;
    private int index = 0;

    public HistoryIterator(HistoryStorage<T> storage) {
        this.storage = storage;
    }

    @Override
    public boolean hasNext() {
        return (index < storage.size());
    }

    @Override
    public T current() {
        return storage.get(index);
    }

    @Override
    public void next() {
        index++;
    }
}
