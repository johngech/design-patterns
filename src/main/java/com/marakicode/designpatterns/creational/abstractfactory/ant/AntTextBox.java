package com.marakicode.designpatterns.creational.abstractfactory.ant;

import com.marakicode.designpatterns.creational.abstractfactory.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant TextBox");
    }
}
