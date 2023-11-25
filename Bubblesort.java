import java.util.Scanner;
public class Bubblesort {
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
        bubbleSort(array); 
        System.out.println();
        System.out.println("Array after Bubble sort:");
        for (int i = 0; i < n; i++) {
            System.out.println("Element at " + i + " index is:" + array[i]);
        }
    }
    public static void bubbleSort(int[] arr) { 
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

