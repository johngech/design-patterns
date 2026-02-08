package com.marakicode.designpatterns.structural.flyweight;

public class TestFlyweight {
    public static void test(){
        var service = new PointService(new PointIconFactory());
        service.getPoints()
                .forEach(Point::draw);
    }
}
