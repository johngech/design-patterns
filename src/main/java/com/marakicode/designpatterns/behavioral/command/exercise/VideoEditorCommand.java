package com.marakicode.designpatterns.behavioral.command.exercise;

import java.util.ArrayList;
import java.util.List;

public class VideoEditorCommand implements UndoableCommand {
    private final List<UndoableCommand> commands = new ArrayList<>();

    public void add(UndoableCommand command) {
        commands.add(command);
    }

    public void execute() {
        commands.forEach(UndoableCommand::execute);
    }

    @Override
    public void unexecute() {
        commands.forEach(UndoableCommand::unexecute);
    }
}
