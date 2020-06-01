package com.piyushpatel2005.factorymethod.abstractCreator;

abstract class AbstractShapeFactory {
    protected abstract Shape factoryMethod();

    // factory method is hidden behind getShape method when client calls.
    public Shape getShape() {
        return factoryMethod();
    }
}

class RectangleFactory extends AbstractShapeFactory {

    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}

class SquareFactory extends AbstractShapeFactory {

    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
}

class CircleFactory extends AbstractShapeFactory {

    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}
