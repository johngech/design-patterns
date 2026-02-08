package com.marakicode.designpatterns.structural.criteria;

import java.util.ArrayList;
import java.util.List;

public class FemaleCriteria implements Criteria<Person> {
    @Override
    public List<Person> meetCriteria(List<Person> entities) {
        List<Person> females = new ArrayList<>();
        for (var entity : entities) {
            if (entity.getGender() == Gender.FEMALE)
                females.add(entity);
        }
        return females;
    }
}
