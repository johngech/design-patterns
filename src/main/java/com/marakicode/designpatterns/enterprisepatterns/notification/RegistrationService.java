package com.marakicode.designpatterns.enterprisepatterns.notification;


public class RegistrationService {
    public void register(User user) {
        System.out.println("Registering user: " + user.email());
    }
}
