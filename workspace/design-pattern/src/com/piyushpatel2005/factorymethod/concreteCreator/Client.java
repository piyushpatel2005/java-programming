package com.piyushpatel2005.factorymethod.concreteCreator;

public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        AnimalFactory animalFactory = new AnimalFactory();
        Animal tiger = animalFactory.getAnimal("tiger");
        tiger.walk();

        Animal dog = animalFactory.getAnimal("DOg");
        dog.walk();
    }
}
