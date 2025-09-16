package Level_1.Exercise_1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> animalsList = Arrays.asList("Lion", "Tiger", "Turtle", "Zebra");

        printList((List<String> list) -> list.stream()
                .filter(animal -> animal.toLowerCase().contains("o"))
                .forEach(System.out::println),
                animalsList);
    }

    public static <T> void printList(ListPrinter<T> printer, List<T> list){
        printer.printList(list);
    }
}