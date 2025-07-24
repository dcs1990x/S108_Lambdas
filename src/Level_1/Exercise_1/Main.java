package Level_1.Exercise_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> animalsList = new ArrayList<>(Arrays.asList("Lion", "Tiger", "Turtle", "Zebra"));

        printList(list -> {
            for (String animal : list) {
                if (animal.toLowerCase().contains("o")) {
                    System.out.println(animal);
                }
            }
        }, animalsList);
    }

    public static <T> void printList(ListPrinter<T> printer, List<T> list){
        printer.printList(list);
    }
}