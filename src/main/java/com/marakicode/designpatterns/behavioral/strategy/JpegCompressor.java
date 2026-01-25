package com.marakicode.designpatterns.behavioral.strategy;

public class JpegCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using jpeg:" + fileName);
    }
}
