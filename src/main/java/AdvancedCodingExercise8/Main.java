package AdvancedCodingExercise8;

import java.util.Scanner;

/**
 * Create a Car enum class with FERRARI, PORSCHE, MERCEDES, BMW, OPEL, FIAT, TOYOTA etc. constants.
 * Each vehicle has its own parameters, e.g. price, power, etc. Enum should contain boolean isPremium() and boolean isRegular() methods.
 * The isPremium() method should return the opposite result to the call of the isRegular() method.
 * In addition, the boolean isFasterThan() method should be declared and implemented as part of the enum class.
 * This method should accept the Car type object and display information that the indicated vehicle
 * is faster or not than the vehicle provided in the argument. To do this, use the compareTo() method.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car selectedCar = null;
        while (selectedCar == null) {
            System.out.println("Please insert a car name");
            String carName = scanner.nextLine();

            try {
                selectedCar = Car.valueOf(carName.toUpperCase().trim());
                System.out.println("Is premium: " + selectedCar.isPremium());
                System.out.println("Is regular: " + selectedCar.isRegular());
                System.out.println("Is faster than Ferarri: " + selectedCar.isFasterThan(Car.FERRARI));

            } catch (IllegalArgumentException e) {
                System.err.println("Car was not found");
            }
        }
    }
}
