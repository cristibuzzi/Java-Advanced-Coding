package ex7;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 * Create a CarService class that will contain a list of cars and implement the following methods:
 * 1. adding cars to the list,
 * 2. removing a car from the list,
 * 3. returning a list of all cars,
 * 4. returning cars with a V12 engine,
 * 5. returning cars produced before 1999,
 * 6. returning the most expensive car,
 * 7. returning the cheapest car,
 * 8. returning the car with at least 3 manufacturers,
 * 9. returning a list of all cars sorted according to the passed parameter: ascending / descending,
 * 10. checking if a specific car is on the list,
 * 11. returning a list of cars manufactured by a specific manufacturer,
 * 12. returning the list of cars manufactured by the manufacturer with the year of establishment <,>, <=,> =, =,! = from the given.
 */

public class CarService {

    public final List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public List<Car> getAllCars() {
        return new ArrayList<>(cars);
    }

    public List<Car> getAllCarsByEngineType(EngineType engineType) {
        return cars.stream()
                .filter(car -> car.getEngineType().equals(engineType))
                .collect(Collectors.toList());
    }

    public List<Car> getAllCarsProducedBefore(int year) {
        return cars.stream()
                .filter(car -> car.getYearOfManufacture() < year)
                .collect(Collectors.toList());
    }

    public Optional<Car> getTheMostExpensiveCar() {
        OptionalDouble maxPrice = cars.stream()
                .mapToDouble(car -> car.getPrice())
                .max();
        if (maxPrice.isPresent()) {
            return cars.stream()
                    .filter(car -> car.getPrice() == maxPrice.getAsDouble())
                    .findAny();
        } else {
            return Optional.empty();

        }
    }

    public Optional<Car> getTheMostExpensiveCarV2() {
        return cars.stream()
                .sorted((car1, car2) -> Double.compare(car2.getPrice(), car1.getPrice()))
                .findFirst();
    }

    public Optional<Car> getTheMostCheaperCar() {
        return cars.stream()
                .sorted((car1, car2) -> Double.compare(car1.getPrice(), car2.getPrice()))
                .findFirst();
    }

    public List<Car> getCarsWithAtLeast3Manufactures() {
        return cars.stream()
                .filter(car -> car.getManufactures().size() > 2)
                .collect(Collectors.toList());
    }

    public List<Car> getAllCarsSortedByYear(boolean ascending) {
        return cars.stream()
                .sorted((car1, car2) -> {
                    if (ascending) {
                        return Integer.compare(car1.getYearOfManufacture(), car2.getYearOfManufacture());
                    } else {
                        return Integer.compare(car2.getYearOfManufacture(), car1.getYearOfManufacture());
                    }
                })
                .collect(Collectors.toList());
    }

    public boolean isCarPresent(Car car) {
        return cars.contains(car);
    }

    public List<Car> getCarsByManufacturer(Manufacturer manufacturer) {
        return cars.stream()
                .filter(car -> car.getManufactures().contains(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsByManufacturerYearOfEstabilisment(String operator, int year) {
        return cars.stream()
                .filter(car -> {
                    switch (operator) {
                        case "<":
                            return car.getManufactures().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() < year);

                        case ">":
                            return car.getManufactures().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() > year);

                        case ">=":
                            return car.getManufactures().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() >= year);

                        case "<=":
                            return car.getManufactures().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() <= year);

                        case "==":
                            return car.getManufactures().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() == year);

                        case "!=":
                            return car.getManufactures().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() != year);

                        default:
                            throw new IllegalArgumentException("Unknown operator: " + operator);

                    }

                })
                .collect(Collectors.toList());
    }
}