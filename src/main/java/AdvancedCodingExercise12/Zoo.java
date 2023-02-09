package AdvancedCodingExercise12;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * /**
 * *Create a Zoo class that will have a collection of animals and will allow you to receive statistics about your animals:
 * int getNumberOfAllAnimals() → returns the number of all animals
 * Map getAnimalsCount() → returns the number of animals of each species
 * Map getAnimalsCountSorted() → returns the number of animals of each species sorted based on the number of animals of a given species,
 * where the first element is always the species with the largest number of animals
 * * void addAnimals(String, int) → adds n animals of a given species
 */


public class Zoo {

    private final Map<String, Integer> numberOfAnimalsBySpecies = new HashMap<>();

    public int getNumberOfAllAnimals() {
        return numberOfAnimalsBySpecies.values()
                .stream()
                .collect(Collectors.summingInt(value -> value));
    }

    public Map<String, Integer> getAnimalsCount() {
        return new HashMap<>(numberOfAnimalsBySpecies);
    }

    public void addAnimals(String species, int numberOfAnimals) {
        if (!numberOfAnimalsBySpecies.containsKey(species)) {
            numberOfAnimalsBySpecies.put(species, numberOfAnimals);
        } else {
            int currentNumberOfAnimals = numberOfAnimalsBySpecies.get(species);
            numberOfAnimalsBySpecies.put(species, currentNumberOfAnimals + numberOfAnimals);
        }
    }

    public List<Map.Entry<String, Integer>> getAnimalsCountSorted() {
        return numberOfAnimalsBySpecies.entrySet()
                .stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .collect(Collectors.toList());
    }

    public Map<String, Integer> getAnimalsCountSortedByName() {
        return new TreeMap<>(numberOfAnimalsBySpecies);
    }

    public Map<String, Integer> getAnimalsCountSortedByNameDescending() {
        Map<String, Integer> result = new TreeMap<>((key1, key2) -> key2.compareToIgnoreCase(key1));
        result.putAll(numberOfAnimalsBySpecies);
        return result;
    }
}
