package com.marakicode.designpatterns.architectural.frontcontroller;

public class LoanController extends Controller {
    @Override
    public void process(Request request) {
        System.out.println("Displaying loan service.");
    }
}
