package com.marakicode.designpatterns.structural.flyweight;

import java.util.List;

public class PointService {
    private final PointIconFactory iconFactory;

    public PointService(PointIconFactory iconFactory) {
        this.iconFactory = iconFactory;
    }

    public List<Point> getPoints() {
        return List.of(
                new Point(1, 2, iconFactory.getPointIcon(PointType.CAFE)),
                new Point(2, 3, iconFactory.getPointIcon(PointType.SCHOOL))
        );
    }
}
