package com.marakicode.designpatterns.behavioral.strategy;

public class TestStrategy {
    public static void test() {
//        var storage = new ImageStorage(
//                new JpegCompressor(),
//                new BlackAndWhiteFilter()
//        );
//
//        storage.store("a");

        var imageStorage = new ImageStorage();
        imageStorage.store("a",
                new PngCompressor(),
                new BlackAndWhiteFilter()
        );

        imageStorage.store("a",
                new PngCompressor(),
                new HighContrastFilter()
        );
    }
}
