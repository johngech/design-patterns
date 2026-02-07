package com.marakicode.designpatterns.structural.composite;

public class TestComposite {
    public static void test() {
        var group1 = new Group();
        group1.add(new Shape()); // Generic Shape(Square or Circle)
        group1.add(new Square());
        group1.add(new Square());

        var group2 = new Group();
        group2.add(new Circle()); // Circle
        group2.add(new Circle()); // Circle

        var group = new Group();
        group.add(group1);
        group.add(group2);

        group.render();
        group.move();
    }
}
