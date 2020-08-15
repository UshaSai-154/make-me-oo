package org.oop;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private static double getXDistance(Point p1, Point p2)
    {
       return p2.x - p1.x;
    }

    private  static  double getYDistance(Point p1, Point p2)
    {
        return p2.y - p1.y;
    }

    public double distance(Point point) {
        double xDistance = getXDistance(this, point);
        double yDistance = getYDistance(this, point);
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double direction(Point point) {
        double xDistance = getXDistance(this, point);
        double yDistance = getYDistance(this, point);
        return Math.atan2(yDistance, xDistance);
    }
}
