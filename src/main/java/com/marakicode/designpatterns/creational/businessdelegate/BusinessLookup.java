package com.marakicode.designpatterns.creational.businessdelegate;

import java.util.HashMap;
import java.util.Map;

public class BusinessLookup {
    private final Map<String, BusinessService> services = new HashMap<>();

    public void registerService(String serviceName, BusinessService service) {
        services.put(serviceName, service);
    }

    public BusinessService getService(String name) {
        return services.get(name);
    }
}
