package com.marakicode.designpatterns.creational.prototype;

public class TestPrototype {
    public static void test() {
        var circle = new Circle(1, 1, 20);
        circle.render();
        var context = new ContextMenu();
        context.duplicate(circle);

//        var newCircle = circle.clone();
//        System.out.println("Cloned Circle: " + newCircle);

        var square = new Square(10);
        square.render();
        context.duplicate(square);

        var rectangle = new Rectangle(10, 10);
        rectangle.render();
        context.duplicate(rectangle);

    }
}
