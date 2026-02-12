package com.marakicode.designpatterns.enterprisepatterns.notification;

import java.util.function.Consumer;

public sealed interface Result<T> {
    record Success<T>(T value) implements Result<T> {
    }

    record Failure<T>(ValidationReport report) implements Result<T> {
    }

    // Convenience method to handle both cases
    default void handle(Consumer<T> onSuccess, Consumer<ValidationReport> onFailure) {
        if (this instanceof Success<T>(T value)) onSuccess.accept(value);
        else if (this instanceof Failure<T>(ValidationReport report)) onFailure.accept(report);
    }
}
