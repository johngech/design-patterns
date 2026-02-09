package com.marakicode.designpatterns.creational.abstractfactory.ant;

import com.marakicode.designpatterns.creational.abstractfactory.Button;
import com.marakicode.designpatterns.creational.abstractfactory.TextBox;
import com.marakicode.designpatterns.creational.abstractfactory.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
}
