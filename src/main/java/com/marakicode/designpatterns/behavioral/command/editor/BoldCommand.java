package com.marakicode.designpatterns.behavioral.command.editor;

public class BoldCommand implements UndoableCommand {
    private String preContent;
    private final HtmlDocument document;
    private final History history;

    public BoldCommand(HtmlDocument document, History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void unexecute() {
        document.setContent(preContent);
    }

    @Override
    public void execute() {
        preContent = document.getContent();
        document.makeBold();
        history.push(this);
    }
}
