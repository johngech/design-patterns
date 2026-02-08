package com.marakicode.designpatterns.structural.decorator.exercise1;

public abstract class ArtifactDecorator implements Artifact {
    protected final Artifact artifact;

    protected ArtifactDecorator(Artifact artifact) {
        this.artifact = artifact;
    }

    @Override
    public String render() {
        return artifact.render();
    }
}
