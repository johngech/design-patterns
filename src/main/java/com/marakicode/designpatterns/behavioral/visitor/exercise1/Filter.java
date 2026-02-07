package com.marakicode.designpatterns.behavioral.visitor.exercise1;

public interface Filter {
    void apply(WavFile wavFile);

    void apply(Mp3File mp3File);
}
