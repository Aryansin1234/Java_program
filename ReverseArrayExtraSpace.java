import java.util.Scanner;
public class ReverseArrayExtraSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the " + n + " Elements in array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + i + " index element:");
            array[i] = sc.nextInt();
        }
        int[] reversed = reverseArray(array);
        System.out.println("Array after reverse :");
        for (int i = 0; i < n; i++) {
            System.out.println("Element at " +i+ " index is:"+reversed[i]);
        }
    }
    public static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] reversedArray = new int[n];
        for (int i = 0; i < n; i++) {
            reversedArray[i] = arr[n - i - 1];
        }
        return reversedArray;
    }
}
