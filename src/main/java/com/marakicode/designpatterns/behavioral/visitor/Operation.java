package com.marakicode.designpatterns.behavioral.visitor;

// Visitor
public interface Operation {
    void apply(HeadingNode node);
    void apply(AnchorNode node);
}
