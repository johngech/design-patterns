package com.marakicode.designpatterns.creational.prototype;

public class Square implements Component {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public void render() {
        System.out.println("Original: " + this);
    }

    @Override
    public Component clone() {
        return new Square(length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Square( length: " + length + " )";
    }
}
