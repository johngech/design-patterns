package com.marakicode.designpatterns.behavioral.clientsession;

// Session Manager
public class SessionManager {
    private final SessionStore store;
    private final ApplicationService appService;

    public SessionManager(SessionStore store, ApplicationService appService) {
        this.store = store;
        this.appService = appService;
    }

    public BankSession getSession(String clientId) {
        BankSession session = store.getSession(clientId);
        if (session == null) {
            session = new BankSession(clientId, appService);
            store.addSession(clientId, session);
            System.out.println("Created new session for " + clientId);
        } else {
            System.out.println("Reusing existing session for " + clientId);
        }
        return session;
    }
}