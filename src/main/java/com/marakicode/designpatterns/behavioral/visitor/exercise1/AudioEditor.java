package com.marakicode.designpatterns.behavioral.visitor.exercise1;

import java.util.ArrayList;
import java.util.List;

public class AudioEditor {
    private final List<Filter> filters = new ArrayList<>();
    private final List<Audio> audioFiles = new ArrayList<>();

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void addFile(Audio audio) {
        audioFiles.add(audio);
    }

    public void execute(Filter filter) {
        audioFiles.forEach(audio -> audio.accept(filter));
    }

    public void execute() {
        audioFiles.forEach(audio ->
                filters.forEach(audio::accept)
        );
    }

}
