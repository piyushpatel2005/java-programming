package com.piyushpatel2005.dependencyInjection;

public class Main {
}

class Client {
    private ExampleService service;

    public Client () {
        // specify specific implementation in constructor instead of DI
        service = new ExampleService();
    }

    public String greet() {
        return "Hello" + service.getName();
    }
}

class ExampleService {

    public String getName() {
        return "example-service";
    }
}