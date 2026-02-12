package com.marakicode.designpatterns.behavioral.serversession;

public class TestServerSession {
    public static void test() {
        SessionManager manager = new SessionManager();
        ApplicationService appService = new ApplicationService();

        Client client1 = new Client("client1", manager);
        client1.performOperations(manager, appService);

        Client client2 = new Client("client2", manager);
        client2.performOperations(manager, appService);

        // Reuse client1 session
        client1.performOperations(manager, appService);
    }
}
