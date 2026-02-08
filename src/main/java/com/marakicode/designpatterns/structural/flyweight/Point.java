package com.marakicode.designpatterns.structural.flyweight;

public class Point {
    private int x;
    private int y;
    private PointIcon pointIcon;

    public Point(int x, int y, PointIcon pointIcon) {
        this.x = x;
        this.y = y;
        this.pointIcon = pointIcon;
    }

    public void draw() {
        var builder = new StringBuilder();
        var result = builder.append(pointIcon.getType())
                .append(" at (")
                .append(x)
                .append(",")
                .append(y)
                .append(")");
        System.out.println(result);
    }
}
