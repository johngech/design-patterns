package com.marakicode.designpatterns.creational.abstractfactory.ant;

import com.marakicode.designpatterns.creational.abstractfactory.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant Button");
    }
}
