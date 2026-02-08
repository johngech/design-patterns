package com.marakicode.designpatterns.structural.criteria;

import java.util.ArrayList;
import java.util.List;

public class SingleCriteria implements Criteria<Person> {
    @Override
    public List<Person> meetCriteria(List<Person> entities) {
        List<Person> singles = new ArrayList<>();
        for (var entity : entities) {
            if (entity.getMartialStatus() == MartialStatus.SINGLE)
                singles.add(entity);
        }
        return singles;
    }
}
