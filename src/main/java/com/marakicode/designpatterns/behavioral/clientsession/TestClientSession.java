package com.marakicode.designpatterns.behavioral.clientsession;

public class TestClientSession {

    public static void test() {
        ApplicationService appService = new ApplicationService();
        SessionStore store = new SessionStore();
        SessionManager manager = new SessionManager(store, appService);

        Client client1 = new Client("client1", manager);
        client1.deposit(100);
        client1.withdraw(50);
        client1.getBalance();

        Client client2 = new Client("client2", manager);
        client2.deposit(100);
        client2.withdraw(50);
        client2.getBalance();

        // Reuse session
        Client client1Again = new Client("client1", manager);
        client1Again.deposit(200);
        client1Again.withdraw(10);
        client1Again.getBalance();
    }

}
