package com.marakicode.designpatterns.behavioral.visitor;

public class PlainTextOperation implements Operation {
    @Override
    public void apply(HeadingNode node) {
        System.out.println("Plain text heading");
    }

    @Override
    public void apply(AnchorNode node) {
        System.out.println("Plain text anchor");
    }
}
