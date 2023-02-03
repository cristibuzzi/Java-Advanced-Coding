package ex3;

/**
 * Create a Storage class that will have a private Map field, a public constructor, and methods:
 * addToStorage(String key, String value) → adding elements to the storage
 * printValues(String key) → displaying all elements under a given key
 * findValues(String value) → displaying all keys that have a given value
 * The Storage class should allow you to store multiple values under one key.
 */

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();

        storage.addToStorage("A", "1");
        storage.addToStorage("A", "2");
        storage.addToStorage("A", "3");
        storage.addToStorage("A", "4");
        storage.addToStorage("B", "1");
        storage.addToStorage("B", "2");
        storage.addToStorage("B", "3");
        storage.addToStorage("B", "4");
        storage.addToStorage("C", "1");
        storage.addToStorage("C", "2");
        storage.addToStorage("D", "3");
        storage.addToStorage("D", "4");
        storage.addToStorage("E", "1");
        storage.addToStorage("E", "2");
        storage.addToStorage("F", "3");
        storage.addToStorage("F", "4");
        storage.addToStorage("F", "4");

        storage.printValues("A");
        storage.printValues("B");
        storage.printValues("F");

        storage.findKeys("1");
        storage.findKeys("4");

    }
}

