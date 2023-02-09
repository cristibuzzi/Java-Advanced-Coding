package AdvancedCodingExercise14;

import java.util.List;

/**
 * Design the Joiner class, which in the constructor will take a separator (string)
 * and have a join() method that allows you to specify any number of T-type objects.
 * This method will return a string joining all passed elements
 * by calling their toString() method and separating them with a separator. eg.
 * for Integers and separator "-" it should return: 1-2-3-4 ...
 */

public class Main {
    public static void main(String[] args) {

        Joiner<Integer> integerJoiner = new Joiner<>("-");
        System.out.println(integerJoiner.join(List.of(5, 8, 14, 341, 912, 2, 44)));

        Joiner<String> stringJoiner = new Joiner<>("--");
        System.out.println(stringJoiner.join(List.of("b", "a", "da", "Ana")));

        Joiner<Person> personJoiner = new Joiner<>("\n");
        System.out.println(personJoiner.join(List.of(new Person("Alex", "13.03.2003"), new Person("Paul", "09.06.2001"))));

        System.out.println("------------------------------------------------------------------------------------");
        SortedJoiner<Integer> sortetIntegerJoiner = new SortedJoiner<>("-");
        System.out.println(sortetIntegerJoiner.join(List.of(4, 67, -100, -22, 2311, 90, 74)));

        SortedJoiner<String> sortedStringJoiner = new SortedJoiner<>("---");
        System.out.println(sortedStringJoiner.join(List.of("marcel", "alex", "claudiu")));

        SortedJoiner<Person> personSortedJoiner = new SortedJoiner<>("\n");
        System.out.println(personSortedJoiner.join(List.of(new Person("Paul", "13.03.2003"), new Person("Alex", "09.06.2001"))));


    }
}
