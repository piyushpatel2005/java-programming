package com.piyushpatel2005.interfaceSegregationPrinciple;

import java.awt.*;

public class Main {
}

// wrong choice as 2D shapes also need to implement volume, like square
// So move volume to a separate interface
interface ShapeInterface {
    public double area();
//    public double volume();
}

interface SolidShapeInterface {
    public double volume();
}

interface ManageShapeInterface {
    public double calculate();
}

class Cube implements ShapeInterface, SolidShapeInterface, ManageShapeInterface {

    @Override
    public double area() {
        return 1.0;
    }

    @Override
    public double volume() {
        return 1.0;
    }

    @Override
    public double calculate() {
        return this.area() + this.volume();
    }
}

class Square implements ShapeInterface, ManageShapeInterface {

    @Override
    public double area() {
        return 1.0;
    }

    @Override
    public double calculate() {
        return this.area();
    }
}