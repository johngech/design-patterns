package com.marakicode.designpatterns.structural.decorator.exercise1;

//Editor(Code Editor)
public class TestArtifact {
    public static void test() {
        showArtifactState(new ErrorMarker(new PlayMarker(new MainFile())));
    }

    private static void showArtifactState(Artifact artifact) {
        System.out.println(artifact.render());
    }
}
