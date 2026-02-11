package com.marakicode.designpatterns.creational.businessdelegate;

public class NetflixStreamingService implements VideoStreamingService {
    @Override
    public void doProcessing() {
        System.out.println("Netflix streaming service");
    }
}
