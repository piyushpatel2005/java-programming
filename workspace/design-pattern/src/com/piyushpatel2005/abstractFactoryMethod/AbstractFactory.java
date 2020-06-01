package com.piyushpatel2005.abstractFactoryMethod;

// family of factories
abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}


class ShapeFactory extends AbstractFactory {

    // unnecessarily we need to implement it.
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if (shape == null) {
            return null;
        } else if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("recTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }
}

class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        if (color == null) {
            return null;
        } else if (color.equalsIgnoreCase("red")) {
            return new Red();
        } else if (color.equalsIgnoreCase("blue")) {
            return new Blue();
        } else if (color.equalsIgnoreCase("green")) {
            return new Green();
        } else {
            return null;
        }
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}