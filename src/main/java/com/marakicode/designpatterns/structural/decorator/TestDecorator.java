package com.marakicode.designpatterns.structural.decorator;

public class TestDecorator {
    public static void test() {
        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));
    }

    private static void storeCreditCard(Stream stream) {
        stream.write("1234-1234-1234-1234");
    }
}
