package com.marakicode.designpatterns.structural.criteria;

import java.util.List;

public interface Criteria<T> {
    List<T> meetCriteria(List<T> entities);
}
