package com.marakicode.designpatterns.behavioral.command.exercise;

public class AddTextCommand implements UndoableCommand {
    private String preContent;
    private final Video video;
    private final History history;

    public AddTextCommand(Video video, History history) {
        this.video = video;
        this.history = history;
    }

    @Override
    public void execute() {
        preContent = video.getContent();
        video.addText();
        history.push(this);
    }

    @Override
    public void unexecute() {
        video.setContent(preContent);
    }
}
