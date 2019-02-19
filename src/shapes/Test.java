package shapes;

import shapes.Circle;
import shapes.FieldCalculator;
import shapes.Point;
import shapes.Rectangle;

public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(-2,2);
        Point point2 = new Point(2,2);
        Point point3 = new Point(-2,-4);
        Point point4 = new Point(2,-4);

        Rectangle rectangle = new Rectangle(point1,point2,point3,point4);
        System.out.println(FieldCalculator.calculateField(rectangle));

        Point pointIn = new Point(0,0);
        Point pointOut = new Point(2,2);
        Circle circle = new Circle(pointIn,pointOut);
        Point randomPoint = new Point(1,1);

        System.out.println(FieldCalculator.checkIfPointIsInsideTheCircle(circle,randomPoint));


    }
}
