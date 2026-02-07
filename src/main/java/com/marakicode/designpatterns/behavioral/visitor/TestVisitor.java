package com.marakicode.designpatterns.behavioral.visitor;

public class TestVisitor {
    public static void test() {
        var document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.execute(new PlainTextOperation());
    }
}
