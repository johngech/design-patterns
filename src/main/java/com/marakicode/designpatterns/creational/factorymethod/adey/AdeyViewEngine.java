package com.marakicode.designpatterns.creational.factorymethod.adey;

import com.marakicode.designpatterns.creational.factorymethod.matach.ViewEngine;

import java.util.Map;

public class AdeyViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View rendered by Adey";
    }
}
