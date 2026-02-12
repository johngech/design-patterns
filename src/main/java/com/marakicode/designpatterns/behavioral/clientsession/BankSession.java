package com.marakicode.designpatterns.behavioral.clientsession;


// Session
public class BankSession {
    private final String clientId;
    private final ApplicationService appService;

    public BankSession(String clientId, ApplicationService appService) {
        this.clientId = clientId;
        this.appService = appService;
    }

    public void deposit(double amount) {
        appService.deposit(clientId, amount);
    }

    public void withdraw(double amount) {
        appService.withdraw(clientId, amount);
    }

    public double checkBalance() {
        return appService.checkBalance(clientId);
    }
}