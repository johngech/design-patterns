package com.marakicode.designpatterns.behavioral.memento;

// Memento
public class TextEditorState<T> {
    private final T content;

    public TextEditorState(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}
