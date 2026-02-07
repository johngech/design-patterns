package com.marakicode.designpatterns.behavioral.chainofresponsiblity.exercise1;

public abstract class Encoder {
    private final Encoder encoder;

    protected Encoder(Encoder encoder) {
        this.encoder = encoder;
    }

    public void encode(File file) {
        if (doEncode())
            return;
        if (encoder != null)
            encoder.encode(file);
    }

    protected abstract boolean doEncode();
}
