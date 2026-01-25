package com.marakicode.designpatterns.behavioral.strategy;

public class ImageStorage {
    private Compressor compressor;
    private Filter filter;

    public ImageStorage() {
        // we can provide a default compressor and filter here if we want
    }

    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        compressor.compress(fileName);
        filter.apply(fileName);
    }

    public void store(String fileName, Compressor compressor, Filter filter) {
        compressor.compress(fileName);
        filter.apply(fileName);
    }
}
