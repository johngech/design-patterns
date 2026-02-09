package com.marakicode.designpatterns.creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigManger {
    private final Map<String, Object> settings = new HashMap<>();
    private static ConfigManger instance = new ConfigManger();

    private ConfigManger() {
    }

    public void set(String key, Object value) {
        settings.put(key, value);
    }

    public Object get(String key) {
        return settings.get(key);
    }

    public static ConfigManger getInstance() {
        return instance;
    }
}
