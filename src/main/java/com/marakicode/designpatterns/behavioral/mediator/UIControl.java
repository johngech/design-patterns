package com.marakicode.designpatterns.behavioral.mediator;

public abstract class UIControl {
    private final DialogBox owner;

    protected UIControl(DialogBox owner) {
        this.owner = owner;
    }

    public DialogBox getOwner() {
        return owner;
    }
}
