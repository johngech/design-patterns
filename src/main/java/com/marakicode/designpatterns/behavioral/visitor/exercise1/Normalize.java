package com.marakicode.designpatterns.behavioral.visitor.exercise1;

public class Normalize implements Filter {

    @Override
    public void apply(WavFile wavFile) {
        System.out.println("Apply Normalize to wav file.");
    }

    @Override
    public void apply(Mp3File mp3File) {
        System.out.println("Apply Normalize to Mp3 file.");
    }
}
