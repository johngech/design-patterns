package com.marakicode.designpatterns.behavioral.command.exercise;

public class TestCommand {
    public static void test() {
        var editorCommand = new VideoEditorCommand();

        var video = new Video();
        video.setContent("Video content");

        History history = new History();

        var addContrastCommand = new AddContrastCommand(video, history);
        editorCommand.add(addContrastCommand);

        var addTextCommand = new AddTextCommand(video, history);
        editorCommand.add(addTextCommand);

        System.out.println(video.getContent());

        editorCommand.execute(); // execute commands together

        System.out.println(video.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        undoCommand.execute();
        System.out.println(video.getContent());
    }
}
