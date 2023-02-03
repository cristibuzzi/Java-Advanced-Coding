package AdvancedCodingExercise7;

/**
 * Create a Manufacturer class that will contain fields: name, year of establishment, country.
 * Include all necessary methods and constructor parameters. Implement the hashCode() and equals() methods.
 * Create a Car class that will contain fields: name, model, price, year of manufacture, manufacturer list (Manufacturer),
 * and engine type (represented as the enum class, e.g. V12, V8, V6, S6, S4, S3).
 * Include all necessary methods and constructor parameters. Implement the hashcode() and equals() methods.
 */

import java.util.List;

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
public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService();

        Manufacturer manufacturer1 = new Manufacturer("BMW", 1990, "Germany");
        Manufacturer manufacturer2 = new Manufacturer("Ford", 2000, "Germany");
        Manufacturer manufacturer3 = new Manufacturer("Dacia", 1878, "Germany");

        Car car1 = new Car("BMW", "Ursulet", 15_000, 2009, List.of(manufacturer1), EngineType.V8);
        Car car2 = new Car("BMW", "Ursulet", 15_111, 2022, List.of(manufacturer1), EngineType.V12);
        Car car3 = new Car("BMW", "Ursulet", 15_222, 2015, List.of(manufacturer1), EngineType.V6);
        Car car4 = new Car("BMW", "Ursulet", 15_333, 2001, List.of(manufacturer1), EngineType.S3);
        Car car5 = new Car("BMW", "Ursulet", 15_444, 2016, List.of(manufacturer1, manufacturer2, manufacturer3), EngineType.S4);
        Car car6 = new Car("BMW", "Ursulet", 15_555, 2015, List.of(manufacturer1), EngineType.S6);

        carService.addCar(car1);
        carService.addCar(car2);
        carService.addCar(car3);
        carService.addCar(car4);
        carService.addCar(car5);
        carService.addCar(car6);

        System.out.println("------------------------------------G E T    A L L    C A R S-------------------------------------");
        System.out.println(carService.getAllCars());
        System.out.println();

        System.out.println("---------------------------------------R E M O V E   C A R----------------------------------------");
        carService.removeCar(car2);
        carService.removeCar(car4);
        System.out.println();

        System.out.println("------------------------------------G E T    A L L    C A R S-------------------------------------");
        System.out.println(carService.getAllCars());
        System.out.println();

        System.out.println("----------------------G E T    A L L    C A R S   B Y   E N G I N E   T Y P E---------------------");
        System.out.println(carService.getAllCarsByEngineType(EngineType.V12));
        System.out.println();

        System.out.println("---------------------G E T    A L L    C A R S   P R O D U C E D   B E F O R E--------------------");
        System.out.println(carService.getAllCarsProducedBefore(2015));
        System.out.println();

        System.out.println("----------------------------G E T    M O S T   E X P E N S I VE    C A R--------------------------");
        System.out.println(carService.getTheMostExpensiveCar());
        System.out.println(carService.getTheMostExpensiveCarV2());
        System.out.println();

        System.out.println("-----------------------------G E T    M O S T   C H E A P E R    C A R----------------------------");
        System.out.println(carService.getTheMostCheaperCar());
        System.out.println();

        System.out.println("-------------------G E T    C A R S    A T   L E A S T   3   M A N U F A C T E R S----------------");
        System.out.println(carService.getCarsWithAtLeast3Manufactures());
        System.out.println();

        System.out.println("-------------------------G E T   A L L   C A R S   S O R T E D   B Y   Y E A R--------------------");
        System.out.println(carService.getAllCarsSortedByYear(true));
        System.out.println(carService.getAllCarsSortedByYear(false));
        System.out.println();

        System.out.println("----------------------------------------I S   C A R   P R E S E N T-------------------------------");
        System.out.println(carService.isCarPresent(car2));
        System.out.println();

        System.out.println("----------------------------G E T    C A R S   B Y   M A N U F A C T U R E R----------------------");
        System.out.println(carService.getCarsByManufacturer(manufacturer1));
        System.out.println();

        try {
            System.out.println("--G E T   C A R S   B Y   M A N U F A C T U R E R   Y E A R   O F   E S T A B I L I S M E N T--");
            System.out.println(carService.getCarsByManufacturerYearOfEstabilisment("<", 2000));
            System.out.println(carService.getCarsByManufacturerYearOfEstabilisment(">", 2000));
            System.out.println(carService.getCarsByManufacturerYearOfEstabilisment(">=", 2000));
            System.out.println(carService.getCarsByManufacturerYearOfEstabilisment("<=", 2000));
            System.out.println(carService.getCarsByManufacturerYearOfEstabilisment("==", 2000));
            System.out.println(carService.getCarsByManufacturerYearOfEstabilisment("!=", 2000));
            System.out.println(carService.getCarsByManufacturerYearOfEstabilisment("! =", 2000));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
