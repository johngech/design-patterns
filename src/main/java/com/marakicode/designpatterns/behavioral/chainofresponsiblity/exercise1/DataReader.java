package com.marakicode.designpatterns.behavioral.chainofresponsiblity.exercise1;

public class DataReader {
    private final Encoder encoder;

    public DataReader(Encoder encoder) {
        this.encoder = encoder;
    }

    public void read(File file) {
        encoder.encode(file);
    }
}

