package com.marakicode.designpatterns.structural.adapter;

import com.marakicode.designpatterns.structural.adapter.fx.Caramel;

public class TestAdapter {
    public static void test() {
        var imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
        imageView.apply(new CaramelFilter(new Caramel()));
        imageView.apply(new CaramelAdapter());
    }
}
