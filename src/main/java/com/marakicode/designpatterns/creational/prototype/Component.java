package com.marakicode.designpatterns.creational.prototype;

public interface Component {
    void render();

    Component clone();
}
