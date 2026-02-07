package com.marakicode.designpatterns.structural.composite.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Team implements Entity {
    private final List<Entity> entities = new ArrayList<>();

    public void add(Entity entity) {
        entities.add(entity);
    }

    @Override
    public void move() {
        entities.forEach(Entity::move);
    }
}
