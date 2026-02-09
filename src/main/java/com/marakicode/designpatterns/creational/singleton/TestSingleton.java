package com.marakicode.designpatterns.creational.singleton;

public class TestSingleton {
    public static void test(){
        var manager = ConfigManger.getInstance();
        manager.set("name","John");

        var other = ConfigManger.getInstance();
        System.out.println(other.get("name"));
    }
}
