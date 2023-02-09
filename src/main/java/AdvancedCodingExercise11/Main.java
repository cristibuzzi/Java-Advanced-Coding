package AdvancedCodingExercise11;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Implement the following functionalities based on 100,000 element arrays with randomly selected values:
 * 1. return a list of unique items,
 * 2. return a list of elements that have been repeated at least once in the generated array,
 * 3. return a list of the 25 most frequently recurring items.
 * Implement a method that deduplicates items in the list.
 * If a duplicate is found, it replaces it with a new random value that did not occur before.
 * Check if the method worked correctly by calling method number 2.
 */
/**
 * Implement the following functionalities based on 100,000 element arrays with randomly selected values:
 * 1. return a list of unique items,
 * 2. return a list of elements that have been repeated at least once in the generated array,
 * 3.return a list of the 25 most frequently recurring items.
 * Implement a method that deduplicates items in the list.
 * If a duplicate is found, it replaces it with a new random value that did not occur before.
 * Check if the method worked correctly by calling method number 2.
 */
public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        List<Integer> nonUniqueNumbers = generateList(100000);
        System.out.println(nonUniqueNumbers);
        System.out.println("--------------------------------");
        System.out.println(elementsRepeatedAtLeastOnce(nonUniqueNumbers));
        System.out.println("-------------------------------------------");
        System.out.println(mostFrequently25Items(nonUniqueNumbers));
        System.out.println("-------------");
        System.out.println(deduplicateList(nonUniqueNumbers));

    }

    public static List<Integer> generateList(int size) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.add(RANDOM.nextInt(99999));
        }
        return list;
    }

//    public static List<Integer> generateListV2(int size) {
//        return Stream.generate(() -> RANDOM.nextInt(999))
//                .limit(size)
//                .collect(Collectors.toList());
//    }

    public static Set<Integer> elementsRepeatedAtLeastOnce(List<Integer> list) {
        Set<Integer> uniqueNumbers = new HashSet<>(list);
        List<Integer> repeatedAtLeastOnce = new LinkedList<>(list);
        Iterator<Integer> iterator = repeatedAtLeastOnce.iterator();

        while (iterator.hasNext()) {
            int currentElement = iterator.next();
            if (uniqueNumbers.contains(currentElement)) {
                uniqueNumbers.remove(currentElement);
                iterator.remove();
            }
        }
        return new HashSet<>(repeatedAtLeastOnce);
    }

    public static Set<Integer> mostFrequently25Items(List<Integer> list) {
        Map<Integer, Integer> values = new HashMap<>();

        for (Integer number : elementsRepeatedAtLeastOnce(list)) {
            if (!values.containsKey(number)) {
                values.put(number, 1);
            } else {
                int counter = values.get(number);
                values.put(number, counter + 1);
            }
        }
        return values.entrySet().stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .limit(25)
                .map(entry -> entry.getKey())
                .collect(Collectors.toSet());
    }

    public static Set<Integer> deduplicateList(List<Integer> list){
        Set<Integer> uniqueItems= new HashSet<>(list);
        while(list.size()>uniqueItems.size()){
            uniqueItems.add(RANDOM.nextInt());
        }
        return uniqueItems;
    }
}