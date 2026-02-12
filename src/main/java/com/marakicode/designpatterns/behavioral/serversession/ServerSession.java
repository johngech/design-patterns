package com.marakicode.designpatterns.behavioral.serversession;

// Server-side session
public class ServerSession {
    private final String clientId;
    private double balance;

    public ServerSession(String clientId) {
        this.clientId = clientId;
        this.balance = 0;
    }

    public String getClientId() {
        return clientId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
