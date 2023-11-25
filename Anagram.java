import java.util.Arrays;
import java.util.Scanner;
/*Function to Check whether string is anagram or not*/
public class Anagram {
    static boolean isAnagram(char A[], char B[]) {
        if (A.length != B.length) {
            return false;
        } else {
            int n = A.length;
            for (int i = 0; i < n; i++) {
                if (A[i] != B[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string:");
        String str = sc.nextLine();
        System.out.print("Enter the second string:");
        String str1 = sc.nextLine();
        char c1[] = str.toCharArray();
        char c2[] = str1.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        boolean ans = isAnagram(c1, c2);
        if (ans) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}

