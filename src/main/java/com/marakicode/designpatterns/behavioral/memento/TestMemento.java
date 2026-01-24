package com.marakicode.designpatterns.behavioral.memento;

public class TestMemento {
    public static void test(){
        var editor = new TextEditor<String>();
        var history = new History<TextEditorState<String>>();
        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");

        editor.restoreState(history.pop()); // state will be b
        editor.restoreState(history.pop()); // state will be a
        System.out.println(editor.getContent());
    }
}
