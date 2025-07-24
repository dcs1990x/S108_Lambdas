package Level_1.Exercise_7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Object> unsortedList = Arrays.asList("Lion", 255, 13.5, "Batman");

        List<String> sortedList = unsortedList.stream()
                .map(String::valueOf)
                .sorted(Comparator.comparing(String::length).reversed())
                .toList();

        System.out.println("The unsorted list: \n" + unsortedList);
        System.out.println("The sorted list (from shorter to longer): \n" + sortedList);
    }
}