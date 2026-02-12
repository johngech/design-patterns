package com.marakicode.designpatterns.behavioral.serversession;


// Business logic
public class ApplicationService {
    public void deposit(ServerSession session, double amount) {
        session.setBalance(session.getBalance() + amount);
        System.out.println("Deposited " + amount + " for " + session.getClientId());
    }

    public void withdraw(ServerSession session, double amount) {
        if (session.getBalance() < amount) {
            System.out.println("Insufficient funds for " + session.getClientId());
            return;
        }
        session.setBalance(session.getBalance() - amount);
        System.out.println("Withdrew " + amount + " for " + session.getClientId());
    }

    public double checkBalance(ServerSession session) {
        System.out.println("Balance for " + session.getClientId() + " is " + session.getBalance());
        return session.getBalance();
    }
}


