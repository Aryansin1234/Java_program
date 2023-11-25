import java.util.Scanner;
public class Insertionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter " + n + " Elements in array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + i + " index element:");
            array[i] = sc.nextInt();
        }
        InsertionSort(array); 
        System.out.println();
        System.out.println("Array after Insertion sort:");
        for (int i = 0; i < n; i++) {
            System.out.println("Element at " + i + " index is:" + array[i]);
        }
    }

    public static void InsertionSort(int[] arr) { 
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
