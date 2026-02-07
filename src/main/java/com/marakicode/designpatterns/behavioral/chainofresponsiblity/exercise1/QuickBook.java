package com.marakicode.designpatterns.behavioral.chainofresponsiblity.exercise1;

public class QuickBook extends Encoder {
    protected QuickBook(Encoder encoder) {
        super(encoder);
    }

    @Override
    protected boolean doEncode() {
        System.out.println("QuickBook");
        return false;
    }
}
