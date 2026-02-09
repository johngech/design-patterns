package com.marakicode.designpatterns.creational.abstractfactory.material;

import com.marakicode.designpatterns.creational.abstractfactory.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material TextBox");
    }
}
