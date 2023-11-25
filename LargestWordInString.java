import java.util.Scanner;

public class LargestWordInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String largestWord = findLargestWord(input);

        System.out.println("Largest word in the string: " + largestWord);
    }

    static String findLargestWord(String input) {
        String[] words = input.split(" ");
        String largestWord = "";

        for (String word : words) {
            // Check if the word is longer than the current largest word
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }

        return largestWord;
    }
}

