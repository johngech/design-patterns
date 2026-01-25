package com.marakicode.designpatterns.behavioral.Iterator;

public class TestIterator {
    public static void test() {
//        var history = new BrowseHistory<String>(new ArrayHistoryStorage<>(10));
        var history = new BrowseHistory<String>(new ListHistoryStorage<>());
        history.push("A");
        history.push("B");
        history.push("C");

        var iterator = history.createIterator();
        while (iterator.hasNext()) {
            var current = iterator.current();
            System.out.println(current);
            iterator.next();
        }
    }
}
