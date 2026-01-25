package com.marakicode.designpatterns.behavioral.command;

import com.marakicode.designpatterns.behavioral.command.fx.Button;

public class TestCommand {
    public static void test() {
//        testAddCustomerCommand();
        testCompositeCommand();
    }

    private static void testCompositeCommand() {
        var composite = new CompositeCommand();
        composite.addCommand(new ResizeCommand());
        composite.addCommand(new BlackAndWhiteFilterCommand());
        composite.execute();
        composite.execute();
    }

    private static void testAddCustomerCommand() {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();
    }
}
