package com.marakicode.designpatterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private final Map<String, Ebook> ebooks = new HashMap<>();

    public void add(Ebook ebook) {
        ebooks.put(ebook.getFileName(), ebook);
    }

    public void openEbook(String fileName) {
        var ebook = ebooks.getOrDefault(fileName, null);
        if (ebook == null) {
            System.out.println("No Ebooks are found by name " + fileName);
            return;
        }
        ebook.show();
    }
}
