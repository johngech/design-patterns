package com.marakicode.designpatterns.structural.decorator.exercise1;

public class ErrorMarker extends ArtifactDecorator {
    protected ErrorMarker(Artifact artifact) {
        super(artifact);
    }

    @Override
    public String render() {
        return super.render() + " [Error Marker]";
    }
}
