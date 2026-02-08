package com.marakicode.designpatterns.structural.decorator;

public class EncryptedCloudStream implements Stream {
    private final Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var encrypted = encrypt(data);
        stream.write(encrypted);
    }

    private String encrypt(String data) {
        return "#&^%@#%@!%^$%EWEY&%$";
    }


}
