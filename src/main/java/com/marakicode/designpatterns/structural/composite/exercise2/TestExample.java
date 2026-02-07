package com.marakicode.designpatterns.structural.composite.exercise2;

public class TestExample {
    public static void test() {
        var folder1 = new Folder();
        folder1.add(new File());

        var folder2 = new Folder();
        folder1.add(new File());

        var folder = new Folder();
        folder.add(folder1);
        folder.add(folder2);

        folder.display("indent");
        System.out.println("Size: " + folder.getSize() + "MB");
    }
}
