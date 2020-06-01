package com.piyushpatel2005.abstractFactoryMethod;

interface Color {
    void fill();
}

class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Drawing with red color.");
    }
}


class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Drawing with green color.");
    }
}

class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Drawing with blue color.");
    }
}