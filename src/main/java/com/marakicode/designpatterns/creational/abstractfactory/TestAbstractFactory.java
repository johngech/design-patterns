package com.marakicode.designpatterns.creational.abstractfactory;

import com.marakicode.designpatterns.creational.abstractfactory.ant.AntWidgetFactory;
import com.marakicode.designpatterns.creational.abstractfactory.material.MaterialWidgetFactory;

public class TestAbstractFactory {
    public static void test(){
        var form = new ContactForm();
        form.render(new MaterialWidgetFactory());
        form.render(new AntWidgetFactory());
    }
}
