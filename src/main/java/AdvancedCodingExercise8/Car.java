package AdvancedCodingExercise8;

public enum Car implements Comparable<Car> {

    FERRARI(50000, 600, true),
    PORSCHE(60000, 500, true),
    MERCEDES(70000, 300, true),
    BMW(80000, 400, true),
    OPEL(40000, 100, false),
    FIAT(20000, 120, false),
    TOYOTA(15000, 130, false);

    private final int price;
    private final int power;

    private final boolean isPremium;


    Car(int price, int power, boolean isPremium) {
        this.price = price;
        this.power = power;
        this.isPremium = isPremium;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public boolean isRegular() {
        return !isPremium;
    }

    public boolean isFasterThan(Car other) {
        return compareToOtherCar(other);
    }

    public boolean compareToOtherCar(Car other) {
        if (this.power > other.power) {
            return true;
        }
        return false;
    }


}
