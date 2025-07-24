package Level_1.Exercise_6;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Object> unsortedList = Arrays.asList("Lion", 255, 13.5, "Batman");

        List<String> sortedList = unsortedList.stream()
                .map(String::valueOf)
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .toList();

        System.out.println("The unsorted list: \n" + unsortedList);
        System.out.println("The sorted list (from shorter to longer): \n" + sortedList);
    }
}