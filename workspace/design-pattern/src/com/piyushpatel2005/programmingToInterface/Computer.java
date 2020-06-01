package com.piyushpatel2005.programmingToInterface;

interface DisplayModule {
    public void display();
}

class Monitor implements DisplayModule {
    public void display() {
        System.out.println("Displaying on a Monitor");
    }
}

class Projector implements DisplayModule {
    public void display() {
        System.out.println("Displaying on a Projector");
    }
}

public class Computer {
    DisplayModule dm;

    public void setDisplayModule(DisplayModule dm) {
        this.dm = dm;
    }

    public void display() {
        dm.display();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        DisplayModule dm = new Monitor();
        DisplayModule dm1 = new Projector();

        computer.setDisplayModule(dm);
        computer.display();
        computer.setDisplayModule(dm1);
        computer.display();
    }
}