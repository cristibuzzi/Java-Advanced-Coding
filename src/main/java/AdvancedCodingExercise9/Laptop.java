package AdvancedCodingExercise9;

import java.util.Objects;

public class Laptop extends Computer {
    private String battery;

    public Laptop(String battery, String processor, int ramSizeInMb, String graphicsCard, String company, String model) {
        super(processor, ramSizeInMb, graphicsCard, company, model);
        this.battery = battery;
    }

    public Laptop() {

    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(battery, laptop.battery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }

    @Override
    public String toString() {
        return  super.toString() + "Laptop{" +
                "battery='" + battery + '\'' +
                '}';
    }
}
