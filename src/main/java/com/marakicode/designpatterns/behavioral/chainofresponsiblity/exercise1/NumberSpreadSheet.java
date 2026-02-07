package com.marakicode.designpatterns.behavioral.chainofresponsiblity.exercise1;

public class NumberSpreadSheet extends Encoder {
    protected NumberSpreadSheet(Encoder encoder) {
        super(encoder);
    }

    @Override
    protected boolean doEncode() {
        System.out.println("NumberSpreadSheet");
        return false;
    }
}
