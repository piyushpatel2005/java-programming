package com.piyushpatel2005.factorymethod.staticMethodCreator;

public class Client {
    public static void main(String[] args) {
        // we don't need to create ShapeFactory instance, we can call static method directly.
        Shape shape1 = StaticMethodCreator.getShape("circle");
        shape1.draw();
    }
}
