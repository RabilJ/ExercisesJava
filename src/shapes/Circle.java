package shapes;

public class Circle {
    private Point center;
    private Point edge;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getEdge() {
        return edge;
    }

    public void setEdge(Point edge) {
        this.edge = edge;
    }

    public Circle(Point center, Point edge) {
        this.center = center;
        this.edge = edge;
    }
}
