package com.marakicode.designpatterns.architectural.frontcontroller.usingchainofresponsibility;

public interface Route {
    Controller resolve(String path);
}
