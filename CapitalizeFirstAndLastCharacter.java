import java.util.Scanner;

public class CapitalizeFirstAndLastCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = capitalizeFirstAndLastCharacter(input);

        System.out.println("String with first and last character of each word capitalized: " + result);
    }

    static String capitalizeFirstAndLastCharacter(String input) {
        StringBuilder result = new StringBuilder();

        String[] words = input.split(" ");

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                char lastChar = Character.toUpperCase(word.charAt(word.length() - 1));
                
                result.append(firstChar).append(word.substring(1, word.length() - 1)).append(lastChar).append(" ");
            }
        }
        return result.toString().trim();
    }
}

