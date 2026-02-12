package com.marakicode.designpatterns.behavioral.clientsession;


import java.util.HashMap;
import java.util.Map;

// Session Store
public class SessionStore {
    private final Map<String, BankSession> sessions = new HashMap<>();

    public BankSession getSession(String clientId) {
        return sessions.get(clientId);
    }

    public void addSession(String clientId, BankSession session) {
        sessions.put(clientId, session);
    }

    public void removeSession(String clientId) {
        sessions.remove(clientId);
    }

}