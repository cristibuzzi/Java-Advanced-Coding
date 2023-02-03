package AdvancedCodingExercise3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create a Storage class that will have a private Map field, a public constructor, and methods:
 * addToStorage(String key, String value) → adding elements to the storage
 * printValues(String key) → displaying all elements under a given key
 * findValues(String value) → displaying all keys that have a given value
 * The Storage class should allow you to store multiple values under one key.
 */
public class Storage {

    private final Map<String, List<String>> storage = new HashMap<>();


    public void addToStorage(String key, String value) {
        if (!storage.containsKey(key)) {
            List<String> values = new ArrayList<>();
            values.add(value);
            storage.put(key, values);
        } else {
            List<String> values = storage.get(key);
            if(!values.contains(value)){
                values.add(value);
            }
            storage.put(key, values);
        }
    }

    public void printValues(String key) {
        if (storage.containsKey(key)) {
            System.out.println(storage.get(key));
        } else {
            System.out.println("Key not found");
        }
    }

    public void findKeys(String value) {
        List<String> results = new ArrayList<>();
        for (Map.Entry<String, List<String>> element : storage.entrySet()) {
            if (element.getValue().contains(value)) {
                results.add(element.getKey());
            }
        }
        System.out.println(results);
    }
}