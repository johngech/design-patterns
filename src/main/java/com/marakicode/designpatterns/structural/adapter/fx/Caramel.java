package com.marakicode.designpatterns.structural.adapter.fx;

import com.marakicode.designpatterns.structural.adapter.Image;

// External library
public class Caramel {
    public void init() {
        // required method by this framework
    }

    public void render(Image image) {
        System.out.println("Apply Caramel filter");
    }
}
