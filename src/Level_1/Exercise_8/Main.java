package Level_1.Exercise_8;

public class Main {

    public static void main(String[] args) {

        String string = "Imagine all the people living in peace.";

        StringReverser reverser = (input) ->
            new StringBuilder(input).reverse().toString();

        String reversed = reverser.reverse(string);

        System.out.println(string);
        System.out.println(reversed);
    }
}