package org.avn.codility.capgem;

public class Square implements Shape {

    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return getSideLength() * getSideLength();
    }

    @Override
    public double totalDistance() {
        return 4 * getSideLength();
    }

    @Override
    public int numberOfSides() {
        return 4;
    }
}
