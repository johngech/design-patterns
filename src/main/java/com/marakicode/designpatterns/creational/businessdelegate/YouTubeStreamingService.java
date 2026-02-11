package com.marakicode.designpatterns.creational.businessdelegate;

public class YouTubeStreamingService implements VideoStreamingService {
    @Override
    public void doProcessing() {
        System.out.println("YouTube Streaming Service");
    }
}
