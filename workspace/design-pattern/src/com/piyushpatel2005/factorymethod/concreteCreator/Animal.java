package com.piyushpatel2005.factorymethod.concreteCreator;

public interface Animal {
    void walk();
}

class Tiger implements Animal {

    @Override
    public void walk() {
        System.out.println("Roaring Tiger");
    }
}

class Dog implements Animal {

    @Override
    public void walk() {
        System.out.println("Barking dog");
    }
}
