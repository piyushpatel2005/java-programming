package com.piyushpatel2005.delegation;

class RealPrinter {
    // the delegate
    void print() {
        System.out.println("The Delegate working from RealPrinter");
    }
}

class Printer {
    // the delegator
    RealPrinter p = new RealPrinter();
    // assign responsibility, create a delegate
    void print() {
        System.out.println("The Delegator");
        p.print();
    }
}

class Tester {
    // To outside world it looks like Printer actually prints
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
    }
}