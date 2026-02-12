package com.marakicode.designpatterns.enterprisepatterns.notification;

import java.util.ArrayList;
import java.util.List;

//The Notification Object (The "Bucket")

public class ValidationReport {
    private final List<ValidationError> errors = new ArrayList<>();

    public void addError(String key, String message) {
        errors.add(new ValidationError(key, message));
    }

    public List<ValidationError> getErrors() {
        return errors;
    }

    public boolean isValid() {
        return errors.isEmpty();
    }
}
