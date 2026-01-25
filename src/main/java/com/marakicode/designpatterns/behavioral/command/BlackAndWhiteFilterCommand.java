package com.marakicode.designpatterns.behavioral.command;

import com.marakicode.designpatterns.behavioral.command.fx.Command;

public class BlackAndWhiteFilterCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white filter");
    }
}
