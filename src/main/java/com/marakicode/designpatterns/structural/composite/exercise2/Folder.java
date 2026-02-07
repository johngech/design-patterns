package com.marakicode.designpatterns.structural.composite.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem {
    private final List<FileSystemItem> items = new ArrayList<>();

    public void add(FileSystemItem item) {
        items.add(item);
    }

    @Override
    public void display(String indent) {
        items.forEach(item -> item.display(indent));
    }

    @Override
    public double getSize() {
        return items.stream()
                .map(FileSystemItem::getSize)
                .reduce(0.0, Double::sum);
    }
}
