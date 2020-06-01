package com.piyushpatel2005.singleton.lazythreadsafe;

public class SingletonLazyImplementation {
    // private reference to one and only instance
    private static SingletonLazyImplementation uniqueInstance = null;

    private int data = 0;

    // no client can use it. It is private
    private SingletonLazyImplementation() {}

    public static SingletonLazyImplementation getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new SingletonLazyImplementation();
        return uniqueInstance;
    }

    // setters and getters for data member

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
