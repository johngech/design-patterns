package com.marakicode.designpatterns.behavioral.clientsession;

// Client
public class Client {
    private final BankSession session;

    public Client(String clientId, SessionManager manager) {
        this.session = manager.getSession(clientId);
    }

    public void deposit(double amount) {
        session.deposit(amount);
    }

    public void withdraw(double amount) {
        session.withdraw(amount);
    }

    public void getBalance() {
        session.checkBalance();
    }

}



