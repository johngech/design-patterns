package com.marakicode.designpatterns.architectural.frontcontroller.usingchainofresponsibility;

public class AdminController extends Controller {
    @Override
    public void process(Request request) {
        System.out.println("Display Admin Dashboard");
    }
}
