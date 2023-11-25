import java.util.Scanner;

public class Selectionsort {
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
        SelectionSort(array); 
        System.out.println();
        System.out.println("Array after Selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.println("Element at " + i + " index is:" + array[i]);
        }
    }

    public static void SelectionSort(int[] arr) { 
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

