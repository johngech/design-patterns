package com.marakicode.designpatterns.structural.criteria;

import java.util.ArrayList;
import java.util.List;

public class MarriedCriteria implements Criteria<Person> {
    @Override
    public List<Person> meetCriteria(List<Person> entities) {
        List<Person> marrieds = new ArrayList<>();
        for (var entity : entities) {
            if (entity.getMartialStatus() == MartialStatus.MARRIED)
                marrieds.add(entity);
        }
        return marrieds;
    }
}
