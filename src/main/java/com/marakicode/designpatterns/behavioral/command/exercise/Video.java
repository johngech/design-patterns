package com.marakicode.designpatterns.behavioral.command.exercise;

public class Video {
    private String content;

    public void addText() {
        content = "<Text>" + content + "</Text>";
    }

    public void addContrast() {
        content = "<contrast>" + content + "</contrast>";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
