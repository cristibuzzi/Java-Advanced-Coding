package AdvancedCodingExercise14;

import java.util.List;
import java.util.stream.Collectors;

public class SortedJoiner<T extends Comparable<T>> {

    private String separator;

    public SortedJoiner(String separator) {
        this.separator = separator;
    }

    public String join(List<T> elementList) {
        String result = "";
        List<T> sortedList = elementList.stream()
                .sorted()
                .collect(Collectors.toList());
        for (int i = 0; i < sortedList.size(); i++) {
            result = result + sortedList.get(i);
            if (i < sortedList.size() - 1) {
                result = result + separator;
            }
        }
        return result;
    }
}
