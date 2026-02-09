package com.marakicode.designpatterns.creational.factorymethod.matach;

import java.util.Map;

public interface ViewEngine {
    String render(String viewName, Map<String, Object> context);
}
