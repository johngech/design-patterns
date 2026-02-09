package com.marakicode.designpatterns.architectural.frontcontroller;

public class TransferController extends Controller {
    @Override
    public void process(Request request) {
        System.out.println("Processing money transfer.");
    }
}
