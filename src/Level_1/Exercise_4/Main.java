package Level_1.Exercise_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> months = new ArrayList<>(Arrays.asList("January", "February", "March", "April",
                "May", "June", "July", "August", "September",
                "October", "November", "December"));

        months.forEach(System.out::println);
    }
}