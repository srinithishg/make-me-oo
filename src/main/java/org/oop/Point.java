package org.oop;

public class Point {
    private final double xCoordinate;
    private final double yCoordinate;

    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public double distanceFrom(Point secondPoint) {
        double xDistance = secondPoint.getXCoordinate() - xCoordinate;
        double yDistance = secondPoint.getYCoordinate() - yCoordinate;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double directionFrom(Point secondPoint) {
        double xDistance = secondPoint.getXCoordinate() - xCoordinate;
        double yDistance = secondPoint.getYCoordinate() - yCoordinate;
        return Math.atan2(yDistance, xDistance);
    }

    public double getXCoordinate() {
        return xCoordinate;
    }

    public double getYCoordinate() {
        return yCoordinate;
    }
}