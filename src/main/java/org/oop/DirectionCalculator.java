package org.oop;

public class DirectionCalculator implements Calculator {

    @Override
    public double calculate(Point firstPoint, Point secondPoint) {
        double xDistance = secondPoint.getXCoordinate() - firstPoint.getXCoordinate();
        double yDistance = secondPoint.getYCoordinate() - firstPoint.getYCoordinate();
        return Math.atan2(yDistance, xDistance);
    }
}
