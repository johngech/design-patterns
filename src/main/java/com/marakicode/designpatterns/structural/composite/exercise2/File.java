package com.marakicode.designpatterns.structural.composite.exercise2;

public class File implements FileSystemItem {
    @Override
    public void display(String indent) {
        System.out.println("Display file and size: " + getSize() + "MB");
    }

    @Override
    public double getSize() {
        return 10.1;
    }
}
