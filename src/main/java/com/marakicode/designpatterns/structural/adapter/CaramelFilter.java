package com.marakicode.designpatterns.structural.adapter;

import com.marakicode.designpatterns.structural.adapter.fx.Caramel;

// Adapter
public class CaramelFilter implements Filter {
    private final Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
