package com.marakicode.designpatterns.structural.decorator.exercise1;

public class PlayMarker extends ArtifactDecorator {
    protected PlayMarker(Artifact artifact) {
        super(artifact);
    }

    @Override
    public String render() {
        return super.render() + " [Play Marker]";
    }
}
