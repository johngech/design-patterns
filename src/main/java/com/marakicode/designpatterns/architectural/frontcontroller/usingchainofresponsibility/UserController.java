package com.marakicode.designpatterns.architectural.frontcontroller.usingchainofresponsibility;

public class UserController extends Controller {
    @Override
    public void process(Request request) {
        System.out.println("Display users page");
    }
}
