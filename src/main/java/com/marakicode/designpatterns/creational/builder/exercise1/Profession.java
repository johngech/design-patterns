package com.marakicode.designpatterns.creational.builder.exercise1;

public enum Profession {
    WARRIOR,
    MAGE,
    THIEF,
    PRIEST;

    @Override
    public String toString() {
        return name();
    }
}
