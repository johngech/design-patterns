package com.marakicode.designpatterns.behavioral.visitor;

public class HighlightOperation implements Operation {

    @Override
    public void apply(HeadingNode node) {
        System.out.println("highlight-heaing");
    }

    @Override
    public void apply(AnchorNode node) {
        System.out.println("highlight-anchor");
    }
}
