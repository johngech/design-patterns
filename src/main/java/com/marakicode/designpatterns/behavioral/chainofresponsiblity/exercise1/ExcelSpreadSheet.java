package com.marakicode.designpatterns.behavioral.chainofresponsiblity.exercise1;

public class ExcelSpreadSheet extends Encoder {
    protected ExcelSpreadSheet(Encoder encoder) {
        super(encoder);
    }

    @Override
    protected boolean doEncode() {
        System.out.println("ExcelSpreadSheet");
        return false;
    }
}
