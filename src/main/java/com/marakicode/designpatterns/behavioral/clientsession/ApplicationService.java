package com.marakicode.designpatterns.behavioral.clientsession;

import java.util.HashMap;
import java.util.Map;

// Business logic
public class ApplicationService {
    private final Map<String, Double> balances = new HashMap<>();

    public void deposit(String clientId, double amount) {
        balances.put(clientId, balances.getOrDefault(clientId, 0.0) + amount);
        System.out.println("Deposited " + amount + " for " + clientId);
    }

    public void withdraw(String clientId, double amount) {
        double availableBalance = balances.getOrDefault(clientId, 0.0);
        if (availableBalance < amount) {
            System.out.println("Insufficient funds for " + clientId);
            return;
        }
        balances.put(clientId, availableBalance - amount);
        System.out.println("Withdrew " + amount + " for " + clientId);
    }

    public double checkBalance(String clientId) {
        double balance = balances.getOrDefault(clientId, 0.0);
        System.out.println("Balance for " + clientId + " is " + balance);
        return balance;
    }
}