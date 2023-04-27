import java.util.Scanner;

public class MavenExercises {
// Reverse Casing
    public static String reverseCase(String input) {
        char [] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)){
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }
// Reverse String
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

// String is Integer
    public static String isNumber (String input) {
        try {
            Integer.parseInt(input);
            return input + " is a number";
        } catch (NumberFormatException e) {
            return input + " is not a number";
        }
    }
// MAIN START
    public static void main(String[] args) {
        String userInput = "Life, The Universe, and Everything";
        System.out.printf("You Entered: %s%n", userInput);
        System.out.println(isNumber(userInput));
        System.out.println("Flipped Case: "+ reverseCase(userInput));
        System.out.println("Reversed: "+ reverseString(userInput));
    }
// MAIN END

}
