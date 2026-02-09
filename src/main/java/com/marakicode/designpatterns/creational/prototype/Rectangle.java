package com.marakicode.designpatterns.creational.prototype;

public class Rectangle implements Component {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public void render() {
        System.out.println("Original: " + this);
    }

    @Override
    public Component clone() {
        return new Rectangle(width,length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle(width: " + width + ", length: " + length + ")";
    }
}
