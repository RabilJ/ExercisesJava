package shapes;

import shapes.Point;

public class Rectangle {
    private Point upperLeft;
    private Point upperRight;
    private Point lowerLeft;
    private Point lowerRight;

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    public Point getUpperRight() {
        return upperRight;
    }

    public void setUpperRight(Point upperRight) {
        this.upperRight = upperRight;
    }

    public Point getLowerLeft() {
        return lowerLeft;
    }

    public void setLowerLeft(Point lowerLeft) {
        this.lowerLeft = lowerLeft;
    }

    public Point getLowerRight() {
        return lowerRight;
    }

    public void setLowerRight(Point lowerRight) {
        this.lowerRight = lowerRight;
    }

    public Rectangle(Point upperLeft, Point upperRight, Point lowerLeft, Point lowerRight) {
        this.upperLeft = upperLeft;
        this.upperRight = upperRight;
        this.lowerLeft = lowerLeft;
        this.lowerRight = lowerRight;
    }
}
