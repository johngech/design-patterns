package com.marakicode.designpatterns.behavioral.mediator.exercise1;

public class SignupDialogBox {
    private final TextBox usernameTextBox = new TextBox();
    private final TextBox emailTextBox = new TextBox();
    private final CheckBox checkBox = new CheckBox();
    private final Button signupButton = new Button();

    public SignupDialogBox() {
        usernameTextBox.addEventHandler(this::handleControlChanged);
        emailTextBox.addEventHandler(this::handleControlChanged);
        checkBox.addEventHandler(this::handleControlChanged);
    }

    public void simulateUserInteraction() {
        System.out.println("--- Initial State ---");
        System.out.println("Button Enabled: " + signupButton.isEnabled());

        System.out.println("\n--- Filling Form ---");
        usernameTextBox.setContent("maraki_user");
        emailTextBox.setContent("user@domain.com");
        checkBox.setChecked(true);

        System.out.println("Username: " + usernameTextBox.getContent());
        System.out.println("Email: " + emailTextBox.getContent());
        System.out.println("CheckBox: " + checkBox.isChecked());
        System.out.println("SignupButton Enabled: " + signupButton.isEnabled());

        System.out.println("\n--- Unchecking Terms ---");
//        checkBox.setChecked(false);
//        usernameTextBox.setContent("");
        System.out.println("SignupButton Enabled: " + signupButton.isEnabled());
    }

    private void handleControlChanged() {
        signupButton.setEnabled(isFormValid());
    }

    private boolean isFormValid() {
        var username = usernameTextBox.getContent();
        var email = emailTextBox.getContent();
        var isChecked = checkBox.isChecked();
        return (!(username == null || username.isEmpty()) &&
                !(email == null || email.isEmpty()) && isChecked
        );
    }

}
