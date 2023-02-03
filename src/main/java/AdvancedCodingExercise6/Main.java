package AdvancedCodingExercise6;

/**
 * Create a Point2D class with fields double x, double y, getters, setters and constructor.
 * Then create a Circle class that will have a constructor: Circle(Point2D center, Point2D point)
 * The first parameter specifies the center of the circle, the second is any point on the circle.
 * Based on these points, the Circle class is to determine: • circle radius when calling double getRadius() method •
 * circle circumference when calling double getPerimeter() method
 * • circle area when calling double getArea() method
 */

/**
 * Create a MoveDirection class with fields double x, double y as well as getters, setters and constructor.
 * Create a Movable interface with the move(MoveDirection moveDirection) method.
 * Implement the interface in the classes from the previous task (Point2D and Circle).
 * When the move(MoveDirection moveDirection) method is called, the objects are to change their position
 * based on the provided direction (MoveDirection). Validate the offset by calling the other Circle methods.
 */

/**
 * Create a Resizable interface with the resize(double resizeFactor) method.
 * Implement the interface in the class from the previous task (Circle).
 * When calling the resize(double resizeFactor) method,
 * the circle should change its size by a given factor (1.5, 0.5, 10.0, etc.).
 * Validate the resizing by calling the other Circle methods.
 */


public class Main {
    public static void main(String[] args) {

        Point2D point1 = new Point2D(2, 2);
        Point2D point2 = new Point2D(3, 3);

        Circle circle1 = new Circle(point1, point2);

        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPermiter());

        System.out.println("---------------------");

        MoveDirection moveDirection = new MoveDirection(2, 2);
        circle1.move(moveDirection);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPermiter());
        System.out.println("---------------------");

        point2.move(moveDirection);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPermiter());

        System.out.println("---------------------");

        circle1.resize(2);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPermiter());
    }
}
