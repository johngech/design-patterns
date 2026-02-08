package com.marakicode.designpatterns.structural.proxy;

public class TestProxy {
    public static void test() {
        var lib = new Library();
        String[] fileNames = {"a", "b", "c"};
        for (var fileName : fileNames)
//            lib.add(new EbookProxy(file));
            lib.add(new LoggingEbookProxy(fileName));
        lib.openEbook("a");
        lib.openEbook("b");
    }
}
