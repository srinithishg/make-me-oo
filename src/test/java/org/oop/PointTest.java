package org.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {
    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);
        Calculator distance = new DistanceCalculator();

        double actualDistance = distance.calculate(origin, origin);

        assertEquals(0, actualDistance);
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);
        Point firstPoint = new Point(1, 0);
        Point secondPoint = new Point(0, 1);
        Calculator distance = new DistanceCalculator();

        double actualDistance1 = distance.calculate(origin, firstPoint);
        double actualDistance2 = distance.calculate(origin, secondPoint);

        assertEquals(1, actualDistance1);
        assertEquals(1, actualDistance2);
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point firstPoint = new Point(1, 0);
        Point secondPoint = new Point(-1, 0);
        Calculator distance = new DistanceCalculator();

        double actualDistance = distance.calculate(firstPoint, secondPoint);

        assertEquals(2, actualDistance);
    }

    @Test
    void originAndPointOnPositiveXAxisShouldBeZeroRadiansAway() {
        Point origin = new Point(0, 0);
        Point firstPoint = new Point(1, 0);
        Point secondPoint = new Point(3, 0);
        Calculator direction = new DirectionCalculator();

        double actualDirection1 = direction.calculate(origin, firstPoint);
        double actualDirection2 = direction.calculate(origin, secondPoint);

        assertEquals(0, actualDirection1);
        assertEquals(0, actualDirection2);
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = new Point(0, 0);
        Point firstPoint = new Point(-1, 0);
        Point secondPoint = new Point(-3, 0);
        Calculator direction = new DirectionCalculator();

        double actualDirection1 = direction.calculate(origin, firstPoint);
        double actualDirection2 = direction.calculate(origin, secondPoint);

        assertEquals(Math.PI, actualDirection1);
        assertEquals(Math.PI, actualDirection2);
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point origin = new Point(0, 0);
        Point firstPoint = new Point(0, 1);
        Point secondPoint = new Point(0, 3);
        Calculator direction = new DirectionCalculator();

        double actualDirection1 = direction.calculate(origin, firstPoint);
        double actualDirection2 = direction.calculate(origin, secondPoint);

        assertEquals(Math.PI / 2, actualDirection1);
        assertEquals(Math.PI / 2, actualDirection2);
    }
}