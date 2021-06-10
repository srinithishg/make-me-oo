package org.oop;

class DistanceCalculator implements Calculator {

    @Override
    public double calculate(Point firstPoint, Point secondPoint) {
        double xDistance = secondPoint.getXCoordinate() - firstPoint.getXCoordinate();
        double yDistance = secondPoint.getYCoordinate() - firstPoint.getYCoordinate();
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }
}
