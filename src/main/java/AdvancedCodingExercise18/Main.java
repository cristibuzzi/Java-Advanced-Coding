package AdvancedCodingExercise18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Write a program that will count the occurrences of each word in a text file
 * and then save the results in the form of a table in a new file
 */

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\Cristi\\SDA\\Proiecte\\sda-java-advanced-coding\\Files\\File.txt");
        wordOccurrencesTable(path);
    }

    public static void wordOccurrencesTable(Path path) throws IOException {
        String lines = Files.readAllLines(path).stream()
                .reduce(
                        "",
                        (currentValue, element) -> currentValue + " " + element

                );
        String[] words = lines.trim().split(" ");
        Map<String, Integer> occurrencesOfWords = new HashMap<>();

        for (String word : words) {
            if (!occurrencesOfWords.containsKey(word)) {
                occurrencesOfWords.put(word, 1);
            } else {
                occurrencesOfWords.put(word, occurrencesOfWords.get(word) + 1);
            }
        }

        Path newFile = path.getParent().resolve("TableFile.txt");

        Files.write(
                newFile,
                occurrencesOfWords.entrySet().stream()
                        .map(e -> "| Key: " + e.getKey() + "| Value: " + e.getValue() + "|" + "\n ----------- ")
                        .collect(Collectors.toList())
        );

    }
}