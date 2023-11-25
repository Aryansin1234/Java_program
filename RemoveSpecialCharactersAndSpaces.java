import java.util.Scanner;

public class RemoveSpecialCharactersAndSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = removeSpecialCharactersAndSpaces(input);

        System.out.println("String after removing special characters and spaces: " + result);
    }

    static String removeSpecialCharactersAndSpaces(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }
}

