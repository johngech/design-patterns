package com.marakicode.designpatterns.enterprisepatterns.notification;

public class UserValidator implements Validator<User> {
    @Override
    public Result<User> validate(User user) {
        var report = new ValidationReport();
        if (user.email() == null || !user.email().contains("@")) {
            report.addError("email", "Invalid email format");
        }
        if (user.password() == null || user.password().length() < 8) {
            report.addError("password", "Password must be at least 8 characters");
        }
        return report.isValid() ? new Result.Success<>(user) : new Result.Failure<>(report);
    }
}
