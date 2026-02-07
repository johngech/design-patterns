package com.marakicode.designpatterns.structural.adapter;

import com.marakicode.designpatterns.structural.adapter.fx.Caramel;

// Using inheritance

public class CaramelAdapter extends Caramel implements Filter {
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
