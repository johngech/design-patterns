package com.marakicode.designpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

// Caretaker
public class History<T extends TextEditorState> {
    private List<T> states = new ArrayList<>();

    public void push(T content) {
        this.states.add(content);
    }

    public T pop() {
        var lastItem = states.getLast();
        states.remove(lastItem);
        return lastItem;
    }

    public List<T> getStates() {
        return states;
    }
}
