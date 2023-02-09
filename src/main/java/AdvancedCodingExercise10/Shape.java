package AdvancedCodingExercise10;

public abstract class Shape {

    private final int numberOfSides;

    protected Shape(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    public int getNumberOfSides() {
        return numberOfSides;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "numberOfSides=" + numberOfSides +
                '}';
    }
}
