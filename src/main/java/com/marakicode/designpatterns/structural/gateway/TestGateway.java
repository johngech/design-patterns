package com.marakicode.designpatterns.structural.gateway;

public class TestGateway {
    public static void test(){
        var factory = new GatewayFactory();
        factory.addGateway("payment",new PaymentGateway());
        factory.addGateway("message",new MessageGateway());
        factory.addGateway("other",new OtherGateway());
        var client = new Client(factory);
        client.execute();
    }
}
