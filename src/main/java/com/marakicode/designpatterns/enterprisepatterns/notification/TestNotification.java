package com.marakicode.designpatterns.enterprisepatterns.notification;

public class TestNotification {
    public static void test() {
        var user = new User("john@domain.com", "12345678");
        var validator = new UserValidator();
        var service = new RegistrationService();

        validator.validate(user).handle(
                validatedUser -> service.register(validatedUser), // Only runs if valid
                errorReport -> errorReport.getErrors()
                        .forEach(error ->
                                System.out.println("{ " + error.name() + ": " + error.message() + " }")
                        )
        );
    }
}
