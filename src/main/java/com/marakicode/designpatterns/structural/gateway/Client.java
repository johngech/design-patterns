package com.marakicode.designpatterns.structural.gateway;

public class Client {
    private final GatewayFactory factory;

    public Client(GatewayFactory factory) {
        this.factory = factory;
    }

    public void execute() {
        for (var gateway : factory.getGateways().values())
            gateway.execute();
    }
}
