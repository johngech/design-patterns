package com.marakicode.designpatterns.structural.criteria;

import java.util.List;

public class AndCriteria<T> implements Criteria<T> {
    private final Criteria<T> criteria;
    private final Criteria<T> other;

    public AndCriteria(Criteria<T> criteria, Criteria<T> other) {
        this.criteria = criteria;
        this.other = other;
    }

    @Override
    public List<T> meetCriteria(List<T> entities) {
        return criteria.meetCriteria(
                other.meetCriteria(entities)
        );
    }
}
