package com.marakicode.designpatterns.behavioral.visitor.exercise1;

public class Mp3File implements Audio {
    @Override
    public void accept(Filter filter) {
        filter.apply(this);
    }
}
