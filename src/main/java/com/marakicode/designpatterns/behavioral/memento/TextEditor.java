package com.marakicode.designpatterns.behavioral.memento;

// Originator
public class TextEditor<T> {
    private T content;

    public TextEditorState<T> createState() {
        return new TextEditorState<>(content);
    }

    public T getContent() {
        return content;
    }

    public void restoreState(TextEditorState<T> state) {
        this.content = state.getContent();
    }

    public void setContent(T content) {
        this.content = content;
    }
}
