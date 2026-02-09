package com.marakicode.designpatterns.creational.builder;

public class TestBuilder {
    public static void test() {
        var presentation = new Presentation();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));

        var pdfBuilder = new PdfDocumentBuilder();
        presentation.export(pdfBuilder);
        var pdf = pdfBuilder.getPdfDocument();

        var movieBuilder = new MovieBuilder();
        presentation.export(movieBuilder);
        var movie = movieBuilder.getMovie();

        var imageBuilder = new ImageBuilder();
        presentation.export(imageBuilder);
        var image = imageBuilder.getImage();

    }
}
