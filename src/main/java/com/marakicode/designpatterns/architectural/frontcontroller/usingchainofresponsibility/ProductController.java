package com.marakicode.designpatterns.architectural.frontcontroller.usingchainofresponsibility;

public class ProductController extends Controller {
    @Override
    public void process(Request request) {
        System.out.println("Display Products page");
    }
}
