package AdvancedCodingExercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Create a method that takes a string list as a parameter, then returns the list sorted alphabetically from Z to A.
 */
public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Cristi");
        names.add("Ana");
        names.add("Alex");
        names.add("Rares");
        names.add("costel");

        List<String> namesSorted = sortListDescendingOrderCasesInsensitive(names);

        System.out.println(namesSorted);
    }

    public static List<String> sortListDescendingOrder(List<String> inputList) {
        List<String> sortedList = new ArrayList<>(inputList);
        sortedList.sort((o1, o2) -> o2.compareTo(o1));
        return sortedList;
    }

    public static List<String> sortListDescendingOrderV2(List<String> inputList) {
        return inputList.stream()
                .sorted((o1,o2) -> o2.compareTo(o1))
                .collect(Collectors.toList());

    }
    public static List<String> sortListDescendingOrderCasesInsensitive (List<String> inputList) {
        return inputList.stream()
                .sorted((o1,o2) -> o2.toLowerCase().compareTo(o1.toLowerCase()))
                .collect(Collectors.toList());
    }
}
