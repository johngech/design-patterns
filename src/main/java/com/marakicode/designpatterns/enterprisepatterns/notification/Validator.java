package com.marakicode.designpatterns.enterprisepatterns.notification;

public interface Validator<T> {
    Result<T> validate(T entity);
}
