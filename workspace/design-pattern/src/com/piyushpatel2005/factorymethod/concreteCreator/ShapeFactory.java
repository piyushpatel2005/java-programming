package com.piyushpatel2005.factorymethod.concreteCreator;

public class ShapeFactory {
    // use getShape to get object of type shape based on argument
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        } else if (shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        else if (shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        else if (shapeType.equalsIgnoreCase("SQUARE"))
            return new Square();
        else
            return null;
    }
}
