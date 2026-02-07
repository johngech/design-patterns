package com.marakicode.designpatterns.behavioral.visitor.exercise1;

public class TestWav {
    public static void test(){
        var editor = new AudioEditor();
        editor.addFile(new WavFile());
        editor.addFile(new Mp3File());
//        editor.execute(new NoiseReduction());

        editor.addFilter(new NoiseReduction());
        editor.addFilter(new Normalize());
        editor.execute();
    }
}
