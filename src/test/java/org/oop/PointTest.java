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
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);

        double actualDistance1 = origin.distanceFrom(point1);
        double actualDistance2 = origin.distanceFrom(point2);

        assertEquals(1, actualDistance1);
        assertEquals(1, actualDistance2);
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);

        double actualDistance = point1.distanceFrom(point2);

        assertEquals(2, actualDistance);
    }

    @Test
    void originAndPointOnPositiveXAxisShouldBeZeroRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);

        double actualDirection1 = origin.directionFrom(point1);
        double actualDirection2 = origin.directionFrom(point2);

        assertEquals(0, actualDirection1);
        assertEquals(0, actualDirection2);
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);

        double actualDirection1 = origin.directionFrom(point1);
        double actualDirection2 = origin.directionFrom(point2);

        assertEquals(Math.PI, actualDirection1);
        assertEquals(Math.PI, actualDirection2);
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);

        double actualDirection1 = origin.directionFrom(point1);
        double actualDirection2 = origin.directionFrom(point2);

        assertEquals(Math.PI / 2, actualDirection1);
        assertEquals(Math.PI / 2, actualDirection2);
    }
}