package AdvancedCodingExercise12;

/**
 * Create a Zoo class that will have a collection of animals and will allow you to receive
 * statistics about your animals: int getNumberOfAllAnimals() → returns the number of all animals Map
 * getAnimalsCount() → returns the number of animals of each species Map
 * getAnimalsCountSorted() → returns the number of animals of each species
 * sorted based on the number of animals of a given species, where the first element
 * is always the species with the largest number of animals
 * void addAnimals(String, int) → adds n animals of a given species
 */

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        zoo.addAnimals("Urs" , 4);
        zoo.addAnimals("Capre" , 2);
        zoo.addAnimals("Caini" , 8);
        zoo.addAnimals("Elefanti" , 3);
        zoo.addAnimals("Elefanti" , 2);

        System.out.println("Number of all animals: " + zoo.getNumberOfAllAnimals());
        System.out.println("Animals count: " +zoo.getAnimalsCount());
        System.out.println("Animals count sorted: " +zoo.getAnimalsCountSorted());
        System.out.println("Animals sorted by name: " + zoo.getAnimalsCountSortedByName());
        System.out.println("Animals sorted by name descending: " + zoo.getAnimalsCountSortedByNameDescending());


    }
}
