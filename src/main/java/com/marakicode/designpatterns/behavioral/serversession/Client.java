package com.marakicode.designpatterns.behavioral.serversession;

// Client
public class Client {
    private final String clientId;
    private final String sessionId;

    public Client(String clientId, SessionManager manager) {
        this.clientId = clientId;
        this.sessionId = manager.createSession(clientId);
    }

    public void performOperations(SessionManager manager, ApplicationService appService) {
        ServerSession session = manager.getSession(sessionId);
        appService.deposit(session, 500);
        appService.withdraw(session, 200);
        appService.checkBalance(session);
    }

    public String getSessionId() {
        return sessionId;
    }

    public String getClientId() {
        return clientId;
    }
}
