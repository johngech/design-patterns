package com.marakicode.designpatterns.behavioral.serversession;

import java.util.UUID;

// Session manager
public class SessionManager {
    private final SessionStore store = new SessionStore();

    public String createSession(String clientId) {
        String sessionId = UUID.randomUUID().toString();
        ServerSession session = new ServerSession(clientId);
        store.add(sessionId, session);
        System.out.println("Created session for " + clientId + " with ID: " + sessionId);
        return sessionId;
    }

    public ServerSession getSession(String sessionId) {
        return store.get(sessionId);
    }
}
