package com.marakicode.designpatterns.structural.bridge;

public class TestBridge {
    public static void test(){
        var control = new RemoteControl(new SonyTv());
        control.turnOn();
       var  advancedControl = new AdvanceRemoteControl(new SamsungTv());
        advancedControl.setChannel(1);
    }
}
