import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = removeVowels(input);

        System.out.println("String after removing vowels: " + result);
    }

    static String removeVowels(String input) {
        StringBuilder result = new StringBuilder();

        String lowerCaseInput = input.toLowerCase();

        for (int i = 0; i < lowerCaseInput.length(); i++) {
            char c = lowerCaseInput.charAt(i);

            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                result.append(input.charAt(i));
            }
        }

        return result.toString();
    }
}

