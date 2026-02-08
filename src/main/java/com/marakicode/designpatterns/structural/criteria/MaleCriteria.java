package com.marakicode.designpatterns.structural.criteria;

import java.util.ArrayList;
import java.util.List;

public class MaleCriteria implements Criteria<Person> {
    @Override
    public List<Person> meetCriteria(List<Person> entities) {
        List<Person> males = new ArrayList<>();
        for (var entity : entities) {
            if (entity.getGender() == Gender.MALE)
                males.add(entity);
        }
        return males;
    }
}
