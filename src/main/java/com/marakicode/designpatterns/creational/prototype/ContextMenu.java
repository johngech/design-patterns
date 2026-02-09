package com.marakicode.designpatterns.creational.prototype;

public class ContextMenu {
    public void duplicate(Component component) {
        var cloned = component.clone();
        System.out.println("Cloned: " + cloned);
    }
}
