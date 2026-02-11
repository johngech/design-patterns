package com.marakicode.designpatterns.creational.businessdelegate;

public class TestMobileClient {
    public static void test(){
        BusinessLookup lookup = new BusinessLookup();
        lookup.registerService("NetflixMusic",new NetflixStreamingService());
        lookup.registerService("YouTubeMusic",new YouTubeStreamingService());
        BusinessDelegate delegate = new BusinessDelegate(lookup);
        var client = new MobileClient(delegate);
        client.play("YouTubeMusic");
        client.play("NetflixMusic");
    }
}
