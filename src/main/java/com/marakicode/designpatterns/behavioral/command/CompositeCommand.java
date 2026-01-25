package com.marakicode.designpatterns.behavioral.command;

import com.marakicode.designpatterns.behavioral.command.fx.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {
    private final List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }
}
