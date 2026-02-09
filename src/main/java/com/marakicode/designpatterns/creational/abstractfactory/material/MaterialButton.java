package com.marakicode.designpatterns.creational.abstractfactory.material;

import com.marakicode.designpatterns.creational.abstractfactory.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material Button");
    }
}
