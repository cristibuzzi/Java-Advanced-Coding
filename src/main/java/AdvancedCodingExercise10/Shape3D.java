package AdvancedCodingExercise10;

public abstract class Shape3D extends Shape implements Fiable {

    public Shape3D(int numOfSides) {
        super(numOfSides);
    }

    public abstract double calculateVolume();

    @Override
    public void fill(double liters) {
        if (liters > calculateVolume()) {
            System.out.println("Water overflow");
        } else if (liters < calculateVolume()) {
            System.out.println("Water not enough");
        } else {
            System.out.println("Figure fill to the brim");
        }
    }
}
