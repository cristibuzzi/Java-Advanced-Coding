package AdvancedCodingExercise10;

public class Cube extends Shape3D {

    private double length;

    public Cube(double length) {
        super(12);
        this.length = length;
    }


    @Override
    public double calculatePerimeter() {
        return getNumberOfSides() * length;
    }

    @Override
    public double calculateArea() {
        return 6 * length * length;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(length, 3); // asa ridicam la o putere(lenght ii ce vrei sa ridici si 3 ii la ce putere vrei sa ridici)
    }
}
