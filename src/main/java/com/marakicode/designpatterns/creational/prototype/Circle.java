package com.marakicode.designpatterns.creational.prototype;

public class Circle implements Component {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void render() {
        System.out.println("Original: " + this);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public Component clone() {
        return new Circle(x, y, radius);
    }

    @Override
    public String toString() {
        return "Circle( x: " + x + ", y: " + y + ", radius: " + radius + " )";
    }
}
