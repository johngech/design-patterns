package com.marakicode.designpatterns.structural.criteria;

import java.util.List;

public class OrCriteria<T> implements Criteria<T> {
    private final Criteria<T> criteria;
    private final Criteria<T> other;

    public OrCriteria(Criteria<T> criteria, Criteria<T> other) {
        this.criteria = criteria;
        this.other = other;
    }

    @Override
    public List<T> meetCriteria(List<T> entities) {
        var firstCriteriaItems = criteria.meetCriteria(entities);
        var otherCriteriaItems = other.meetCriteria(entities);
        for (var item : otherCriteriaItems) {
            if (!firstCriteriaItems.contains(item))
                firstCriteriaItems.add(item);
        }
        return firstCriteriaItems;
    }
}
