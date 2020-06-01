package com.piyushpatel2005.openClosedPrinciple;

interface Shape {
    public double calculateArea();
}

class Rectangle implements Shape {
    public double length;
    public double width;

    public double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape {
    public double radius;

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class AreaCalculator {
    // Bad method choices
//    public double calculateRectangleArea(Rectangle rectangle) {
//        return rectangle.length * rectangle.width;
//    }
//
//    public double calculateCircleArea(Circle circle) {
//        return Math.PI * circle.radius * circle.radius;
//    }

    public double calculateShapeArea(Shape shape) {
        // delegation and polymorphism
        return shape.calculateArea();
    }
}



