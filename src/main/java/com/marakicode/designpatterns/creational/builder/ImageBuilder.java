package com.marakicode.designpatterns.creational.builder;

public class ImageBuilder implements PresentationBuilder {
    private final Image image = new Image();

    @Override
    public void addSlide(Slide slide) {
        image.addPicture(slide.getText());
    }

    public Image getImage() {
        return image;
    }
}
