package com.marakicode.designpatterns.structural.facade;

public class TestFacade {
    public static void test() {
       var service = new NotificationService();
       service.send("Message content","target");
       service.send("Hello world","Another target");
    }
}
