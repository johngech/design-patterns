package com.marakicode.designpatterns.behavioral.Iterator;

public class ArrayHistoryStorage<T> implements HistoryStorage<T> {
    private final T[] items;
    private int count = 0;

    public ArrayHistoryStorage(int capacity) {
        this.items = (T[]) new Object[capacity];
    }

    @Override
    public void add(T item) {
        if (count < items.length) {
            this.items[count++] = item;
        } else {
            throw new RuntimeException("Storage is full!!!");
        }
    }

    @Override
    public T removeLast() {
        return this.items[--count];
    }

    @Override
    public T get(int index) {
        return this.items[index];
    }

    @Override
    public int size() {
        return count;
    }
}
