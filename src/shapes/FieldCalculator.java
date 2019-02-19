package shapes;

import shapes.Circle;

public class FieldCalculator {
    public static double calculateField(Rectangle rectangle) {
        double upperLeftToRightLineLenght = lineLenghtCalculator(rectangle.getUpperLeft(), rectangle.getUpperRight());
        double lowerLeftToRightLineLenght = lineLenghtCalculator(rectangle.getLowerLeft(), rectangle.getLowerRight());
        double upperLeftToLowerLeftLineLenght = lineLenghtCalculator(rectangle.getUpperLeft(), rectangle.getLowerLeft());
        double upperRightToLowerRightLineLenght = lineLenghtCalculator(rectangle.getUpperRight(), rectangle.getLowerRight());
        if (upperLeftToRightLineLenght == lowerLeftToRightLineLenght && upperLeftToLowerLeftLineLenght == upperRightToLowerRightLineLenght) {
                return upperLeftToRightLineLenght * upperLeftToLowerLeftLineLenght;
        } else {
            System.out.println("Nie ma wystarczających danych lub figura nie jest prostokątem");
            return 0.0;
        }
    }

    private static double lineLenghtCalculator(Point point1, Point point2) {
        return Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) +
                Math.pow(point2.getY() - point1.getY(), 2));
    }

    public static boolean checkIfPointIsInsideTheCircle(Circle circle, Point point) {
        return Math.pow((point.getX() - circle.getCenter().getX()), 2) + Math.pow((point.getY() - circle.getCenter().getY()), 2) <=
                Math.pow(lineLenghtCalculator(circle.getCenter(), circle.getEdge()), 2);
    }
}