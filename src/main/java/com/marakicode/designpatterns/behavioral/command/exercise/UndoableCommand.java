package com.marakicode.designpatterns.behavioral.command.exercise;

public interface UndoableCommand extends Command {
    void unexecute();
}
