package AdvancedCodingExercise2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Create a method that takes the map as a parameter,
 * where the key is string and the value number,
 * and then prints each map element to the console in the
 * format: Key: , Value: . There should be a comma at
 * the end of every line except the last, and a period at the last.
 * Example:
 * Key: Java, Value: 18,
 * Key: Python, Value: 1,
 * …
 * Key: PHP, Value: 0.
 */
public class Main {
    public static void main(String[] args) {

        Map<String, Integer> versionByPlatform= new HashMap<>();

        versionByPlatform.put("Java" , 18);
        versionByPlatform.put("Python" , 1);
        versionByPlatform.put("PHP" , 0);

        printKeyValue(versionByPlatform);
    }

    public static void printKeyValue(Map<String, Integer> inputMap) {
        Iterator<Map.Entry<String, Integer>> iterator = inputMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();

            String operator = ",";
            if(!iterator.hasNext()) {
                operator=".";
            }

            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue() + operator);
        }
    }


}
