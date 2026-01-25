package com.marakicode.designpatterns.behavioral.command.exercise;

public class AddContrastCommand implements UndoableCommand {
    private String preContent;
    private Video video;
    private History history;

    public AddContrastCommand(Video video, History history) {
        this.video = video;
        this.history = history;
    }

    @Override
    public void unexecute() {
        video.setContent(preContent);
    }

    @Override
    public void execute() {
        preContent = video.getContent();
        video.addContrast();
        history.push(this);
    }
}
