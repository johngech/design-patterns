package com.marakicode.designpatterns.architectural.frontcontroller.usingchainofresponsibility;

public class HomeController extends Controller {
    @Override
    public void process(Request request) {
        System.out.println("Home page");
    }
}
