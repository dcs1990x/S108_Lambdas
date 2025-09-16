package Level_1.Exercise_2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> animalsList = Arrays.asList("Lion", "Hippopotamus", "Turtle", "Kangaroo");

        printList(list -> {
            List<String> animalsListConditions = list.stream()
                    .filter(animal -> animal.toLowerCase().contains("o"))
                    .filter(animal -> animal.length() > 5)
                    .toList();

            System.out.println(animalsListConditions);
        }, animalsList);
    }

    public static <T> void printList(ListPrinter<T> printer, List<T> list){
        printer.printList(list);
    }
}