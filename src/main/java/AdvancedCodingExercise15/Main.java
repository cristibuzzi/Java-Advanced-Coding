package AdvancedCodingExercise15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a program that will read any file and save it in the same folder.
 * The content and title of the new file should be reversed (from the back).
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\Cristi\\SDA\\Proiecte\\sda-java-advanced-coding\\Files\\File.txt");

        reverseFile(path);

    }

    public static void reverseFile(Path path) throws IOException {
        List<String> fileContent = Files.readAllLines(path);
        String fileName = path.getFileName().toString();

        String newFileName = stringReverse(fileName);
        List<String> newFileContent = fileContent.stream()
                .map(line -> stringReverse(line))
                .collect(Collectors.toList());
        Collections.reverse(newFileContent);

        Path parentFolder = path.getParent();
        Path newFilePath = parentFolder.resolve(newFileName);
        if(!Files.exists(newFilePath)) {
            Files.createFile(newFilePath);
        }
        Files.write(newFilePath, newFileContent);

    }

    public static String stringReverse(String string) {
        String reversedString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reversedString = reversedString + string.charAt(i);
        }
        return reversedString;
    }

}
