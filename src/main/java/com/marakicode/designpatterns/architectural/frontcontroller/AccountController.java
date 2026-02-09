package com.marakicode.designpatterns.architectural.frontcontroller;

public class AccountController extends Controller {
    @Override
    public void process(Request request) {
        System.out.println("Display Account Dashboard.");
    }
}
