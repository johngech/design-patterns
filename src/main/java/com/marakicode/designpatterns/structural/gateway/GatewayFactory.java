package com.marakicode.designpatterns.structural.gateway;

import java.util.HashMap;
import java.util.Map;

public class GatewayFactory {
    private final Map<String, Gateway> gateways = new HashMap<>();

    public void addGateway(String key, Gateway gateway) {
        gateways.put(key, gateway);
    }

    public Gateway getGateway(String key) {
        return gateways.get(key);
    }

    public Map<String, Gateway> getGateways() {
        return gateways;
    }
}
