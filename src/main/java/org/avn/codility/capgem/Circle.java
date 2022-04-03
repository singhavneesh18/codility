package org.avn.codility.capgem;

public class Circle implements Shape {


    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public double totalDistance() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public int numberOfSides() {
        return 0;
    }

    public double getDiameter() {
        return 2 * getRadius();
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
