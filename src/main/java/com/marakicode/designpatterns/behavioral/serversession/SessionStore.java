package com.marakicode.designpatterns.behavioral.serversession;

import java.util.HashMap;
import java.util.Map;

// Session store
public class SessionStore {
    private final Map<String, ServerSession> sessions = new HashMap<>();

    public ServerSession get(String sessionId) {
        return sessions.get(sessionId);
    }

    public void add(String sessionId, ServerSession session) {
        sessions.put(sessionId, session);
    }
}
