package org.oop;

class DistanceCalculator implements Calculator {

    @Override
    public double calculate(Point firstPoint, Point secondPoint) {
        final int powerValue = 2;
        double xDistance = secondPoint.getXCoordinate() - firstPoint.getXCoordinate();
        double yDistance = secondPoint.getYCoordinate() - firstPoint.getYCoordinate();
        return Math.sqrt(Math.pow(xDistance, powerValue) + Math.pow(yDistance, powerValue));
    }
}
