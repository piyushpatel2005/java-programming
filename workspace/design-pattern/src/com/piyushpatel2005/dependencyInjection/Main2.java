package com.piyushpatel2005.dependencyInjection;

public class Main2 {
    public static void main(String[] args) {
        Service service = new ServiceA();
        DIClient client = new DIClient(service); // injects service
        client.doSomething();
    }
}

interface Service {
    void write(String message);
}

class ServiceA implements Service {
    @Override
    public void write(String message) {
        System.out.println("sample write method");
    }
}

class DIClient {
    private Service myService;

    // constructor injection
    public DIClient(Service service) {
        this.myService = service;
    }

    public void doSomething() {
        myService.write("blah");
    }

    public void setService(Service service) {
        this.myService = service;
    }
}