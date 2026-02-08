package com.marakicode.designpatterns.structural.bridge;

public class AdvanceRemoteControl extends RemoteControl {
    public AdvanceRemoteControl(Device device) {
        super(device);
    }

    public void setChannel(int number) {
        device.setChannel(number);
    }
}
