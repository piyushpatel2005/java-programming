package com.piyushpatel2005.abstractFactoryMethod;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory("shape");

        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw();

        shape1 = factory.getShape("rectangle");
        shape1.draw();

        factory = FactoryProducer.getFactory("color");

        Color color = factory.getColor("red");
        color.fill();

    }
}
