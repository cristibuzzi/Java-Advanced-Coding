package AdvancedCodingExercise10;

/**
 * Create an abstract Shape class with the abstract methods
 * calculatePerimeter() for calculating the perimeter and calculateArea() for calculating the area.
 * Create Rectangle, Triangle, Hexagon classes, extending the Shape class, and implementing abstract methods accordingly.
 * Verify the solution correctness.
 */

/**
 * Create an abstract 3DShape class that extends the Shape class from the previous task.
 * Add an additional method calculateVolume().
 * Create Cone and Qube classes by extending the 3DShape class, properly implementing abstract methods.
 * Verify the solution correctness
 */
public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(25,33);
        System.out.println(rectangle);

        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        System.out.println("-----------------------");

        Shape3D cube = new Cube(12);
        System.out.println(cube.calculatePerimeter());
        System.out.println(cube.calculateArea());
        System.out.println(cube.calculateVolume());

        System.out.println("-----------------------");
        cube.fill(1728);
        cube.fill(1329);
        cube.fill(2789);
    }
}
