package Level_1.Exercise_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> animalsList = new ArrayList<>(Arrays.asList("Lion", "Hippopotamus", "Turtle", "Kangaroo"));
        List<String> animalsListConditions = new ArrayList<>();

        printList(list -> {
            for (String animal : list) {
                if (animal.toLowerCase().contains("o") && animal.length() > 5) {
                    animalsListConditions.add(animal);
                }
            }
            System.out.println(animalsListConditions);
        }, animalsList);
    }

    public static <T> void printList(ListPrinter<T> printer, List<T> list){
        printer.printList(list);
    }
}