package com.marakicode.designpatterns.behavioral.visitor.exercise1;

public class Reverb implements Filter {

    @Override
    public void apply(WavFile wavFile) {
        System.out.println("Apply Reverb to wav file.");
    }

    @Override
    public void apply(Mp3File mp3File) {
        System.out.println("Apply Reverb to Mp3 file");
    }
}
