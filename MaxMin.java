import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter "+n+" Elements in array:");
        for(int i=0;i<n;i++)
        {
                System.out.print("Enter the "+i+" index element:");
                array[i] = sc.nextInt();
        }
        int smallest = array[0], secondSmallest = array[0];
        int largest = array[0],secondLargest = array[0];

        for (int i = 1; i < n; i++) {
            if (array[i] < smallest) {
                secondSmallest = smallest;
                smallest = array[i];
                }
            else if (array[i] > smallest && array[i] < secondSmallest) {
                secondSmallest = array[i];
            }
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
                }
            else if (array[i] < largest && array[i] > secondLargest) {
                secondLargest = array[i];
            }
        }
        System.out.println("The second smallest element is " + secondSmallest);
        System.out.println("The second largest element is " + secondLargest);
	}
}

