package com.marakicode.designpatterns.behavioral.chainofresponsiblity;

public class TestWebServer {
    public static void test() {
        var encryptor = new Encryptor(null);
        var compressor = new Compressor(encryptor);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);
        var server = new WebServer(authenticator);
        server.handle(new HttpRequest("admin", "1234"));
    }
}
