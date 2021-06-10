package org.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {
    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);

        double actualDistance = origin.distanceFrom(origin);

        assertEquals(0, actualDistance);
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);
        Point firstPoint = new Point(1, 0);
        Point secondPoint = new Point(0, 1);

        double actualDistance1 = origin.distanceFrom(firstPoint);
        double actualDistance2 = origin.distanceFrom(secondPoint);

        assertEquals(1, actualDistance1);
        assertEquals(1, actualDistance2);
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point firstPoint = new Point(1, 0);
        Point secondPoint = new Point(-1, 0);

        double actualDistance = firstPoint.distanceFrom(secondPoint);

        assertEquals(2, actualDistance);
    }

    @Test
    void originAndPointOnPositiveXAxisShouldBeZeroRadiansAway() {
        Point origin = new Point(0, 0);
        Point firstPoint = new Point(1, 0);
        Point secondPoint = new Point(3, 0);

        double actualDirection1 = origin.directionFrom(firstPoint);
        double actualDirection2 = origin.directionFrom(secondPoint);

        assertEquals(0, actualDirection1);
        assertEquals(0, actualDirection2);
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = new Point(0, 0);
        Point firstPoint = new Point(-1, 0);
        Point secondPoint = new Point(-3, 0);

        double actualDirection1 = origin.directionFrom(firstPoint);
        double actualDirection2 = origin.directionFrom(secondPoint);

        assertEquals(Math.PI, actualDirection1);
        assertEquals(Math.PI, actualDirection2);
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point origin = new Point(0, 0);
        Point firstPoint = new Point(0, 1);
        Point secondPoint = new Point(0, 3);

        double actualDirection1 = origin.directionFrom(firstPoint);
        double actualDirection2 = origin.directionFrom(secondPoint);

        assertEquals(Math.PI / 2, actualDirection1);
        assertEquals(Math.PI / 2, actualDirection2);
    }
}