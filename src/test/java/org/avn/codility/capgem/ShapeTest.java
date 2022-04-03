package org.avn.codility.capgem;

import org.junit.Assert;
import org.junit.Test;

public class ShapeTest {

    final double delta = 0.001;

    @Test
    public void testAreaOfCircle() {
        Shape circle = new Circle(1);
        Assert.assertEquals(Math.PI, circle.getArea(), delta);
    }

    @Test
    public void testTotalDistanceOfCircle() {
        Shape circle = new Circle(1);
        Assert.assertEquals(2 * Math.PI, circle.totalDistance(), delta);
    }

    @Test
    public void testNumberOfSidesOfCircle() {
        Shape circle = new Circle(1);
        Assert.assertEquals(0, circle.numberOfSides());
    }

    @Test
    public void testDiameterOfCircle() {
        Circle circle = new Circle(1);
        Assert.assertEquals(2, circle.getDiameter(), delta);
    }


    // Rectangle test case starts here
    @Test
    public void testAreaOfRectangle() {
        Shape rectangle = new Rectangle(2, 2);
        Assert.assertEquals(4, rectangle.getArea(), delta);
    }

    @Test
    public void testTotalDistanceOfRectangle() {
        Shape rectangle = new Rectangle(2, 2);

        Assert.assertEquals(8, rectangle.totalDistance(), delta);
    }

    @Test
    public void testNumberOfSidesOfRectangle() {
        Shape rectangle = new Rectangle(2, 2);
        Assert.assertEquals(4, rectangle.numberOfSides());
    }
}
