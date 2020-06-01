package com.piyushpatel2005.singleton.lazy;

public class TestSingleton {
    public static void main(String[] args) {
        SingletonLazyImplementation s = SingletonLazyImplementation.getInstance();

        // set data value
        s.setData(55);
        System.out.println("First reference : " + s);
        System.out.println("Data value in first reference: " + s.getData());

        s = null;
        s = SingletonLazyImplementation.getInstance();

        System.out.println("First reference : " + s);
        System.out.println("Data value in first reference: " + s.getData());
    }
}
