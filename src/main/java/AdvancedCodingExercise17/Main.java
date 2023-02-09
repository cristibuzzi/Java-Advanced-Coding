package AdvancedCodingExercise17;

/**
 * Extend the ArrayList class by implementing the getEveryNthElement() method.
 * This method returns a list of elements and takes two parameters:
 * the element index from which it starts and a number specifying which element to choose.
 * For the list: [a, b, c, d, e, f, g] and parameters: startIndex = 2 and skip = 3 it should return [c, g
 */

public class Main {
    public static void main(String[] args) {

        CustomArrayList<String> customArrayList = new CustomArrayList<>();

        customArrayList.add("a");
        customArrayList.add("b");
        customArrayList.add("c");
        customArrayList.add("d");
        customArrayList.add("e");
        customArrayList.add("f");
        customArrayList.add("g");
        customArrayList.add("w");
        customArrayList.add("q");
        customArrayList.add("z");
        customArrayList.add("y");

        System.out.println(customArrayList.getEveryNthElement(2,6));
    }
}
