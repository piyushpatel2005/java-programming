package com.piyushpatel2005.factorymethod.concreteCreator;

public class AnimalFactory {
    public Animal getAnimal(String animalType) {
        if(animalType == null) {
            return null;
        } else if (animalType.equalsIgnoreCase("dog"))
            return new Dog();
        else if (animalType.equalsIgnoreCase("tiger"))
            return new Tiger();
        else
            return null;
    }
}
