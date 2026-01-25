package com.marakicode.designpatterns.behavioral.command.editor;

public class TestCommand {
    public static void test() {
        var document = new HtmlDocument();
        document.setContent("Hello world");
        var history = new History();

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
