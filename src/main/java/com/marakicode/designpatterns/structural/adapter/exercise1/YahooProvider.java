package com.marakicode.designpatterns.structural.adapter.exercise1;

import com.marakicode.designpatterns.structural.adapter.exercise1.fx.Yahoo;

// Adapter
public class YahooProvider extends Yahoo implements EmailProvider {
    @Override
    public void send(String message) {
        init();
        super.send(message);
    }
}
