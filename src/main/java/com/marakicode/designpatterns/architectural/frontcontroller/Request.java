package com.marakicode.designpatterns.architectural.frontcontroller;

public class Request {
    private final String path;
    private final String accessToken;

    public Request(String path, String accessToken) {
        this.path = path;
        this.accessToken = accessToken;
    }

    public String getPath() {
        return path;
    }

    public String getAccessToken() {
        return accessToken;
    }
}
