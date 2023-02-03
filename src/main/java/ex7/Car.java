package ex7;

import java.util.List;
import java.util.Objects;

public class Car {

    private String name;
    private String model;
    private int price;
    private int yearOfManufacture;
    private List<Manufacturer> manufactures;
    private EngineType engineType;

    public Car(

            String name,
            String model,
            int price,
            int yearOfManufacture,
            List<Manufacturer> manufactures,
            EngineType engineType

    ) {

        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.manufactures = manufactures;
        this.engineType=engineType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public List<Manufacturer> getManufactures() {
        return manufactures;
    }

    public void setManufactures(List<Manufacturer> manufactures) {
        this.manufactures = manufactures;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && yearOfManufacture == car.yearOfManufacture && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(manufactures, car.manufactures) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, manufactures, engineType);
    }

    @Override
    public String toString() {
        return "Car: " +
                "name: " + name  +
                ", model: " + model +
                ", price: " + price +
                ", yearOfManufacture: " + yearOfManufacture +
                ", manufactures: " + manufactures +
                ", engineType: " + engineType;
    }
}
