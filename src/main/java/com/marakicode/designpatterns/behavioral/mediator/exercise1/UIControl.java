package com.marakicode.designpatterns.behavioral.mediator.exercise1;

import java.util.ArrayList;
import java.util.List;

public class UIControl {
    private final List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler handler) {
        eventHandlers.add(handler);
    }

    protected void notifyEventHandlers() {
        eventHandlers.forEach(EventHandler::handle);
    }
}
