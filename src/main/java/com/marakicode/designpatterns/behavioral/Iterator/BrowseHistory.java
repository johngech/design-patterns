package com.marakicode.designpatterns.behavioral.Iterator;

public class BrowseHistory<T> {
    private final HistoryStorage<T> storage;

    public BrowseHistory(HistoryStorage<T> storage) {
        this.storage = storage;
    }

    public void push(T data) {
        storage.add(data);
    }

    public T pop() {
        return storage.removeLast();
    }

    public Iterator<T> createIterator() {
        return new HistoryIterator<>(storage);
    }
}