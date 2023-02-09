package AdvancedCodingExercise9;

/**
 * Create a Computer class with fields defining computer features:
 * processor, ram, graphics card, company and model.
 * Implement setters, getters, constructor with all fields, toString(), equals() and hashcode() methods.
 * Instantiate several objects and check how the methods work.
 */


/**
 * Create a Laptop class extending the Computer class from the previous task.
 * The Laptop class should additionally contain the battery parameter.
 * Implement additional getters, setters, constructor and overwrite
 * the toString(), equals() and hashcode() methods accordingly.
 * Use a reference to parent class methods.
 */


/**
 * Create a Fillable interface with the fill() method.
 * Implement the method in the 3DShape class from the previous task or separately in the Cone and Qube classes.
 * The fill() method should take a parameter, e.g. int, and check whether after the action of filling the figure:
 * • will pour too much water into the figure and overflow,
 * • fill the figure with water to the brim,
 * • not pouring enough water. For each situation, it should write the status information in the console.
 * Use the calculateVolume() method.
 */
public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer(
                "Intel" ,
                16,
                "GTX3080" ,
                "Lenovo",
                "asd3"
        );

        System.out.println(computer);

        Computer laptop = new Laptop(
                "battery",
                "Intel" ,
                16,
                "GTX3080" ,
                "Lenovo",
                "asd3"
        );

        System.out.println(laptop);


    }
}
