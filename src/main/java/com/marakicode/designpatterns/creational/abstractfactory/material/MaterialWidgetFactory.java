package com.marakicode.designpatterns.creational.abstractfactory.material;

import com.marakicode.designpatterns.creational.abstractfactory.Button;
import com.marakicode.designpatterns.creational.abstractfactory.TextBox;
import com.marakicode.designpatterns.creational.abstractfactory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
}
