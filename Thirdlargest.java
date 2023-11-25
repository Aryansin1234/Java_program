import java.util.Scanner;
public class Thirdlargest {
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
        int thirdLargest= findThirdLargest(array);
        System.out.println("The third largest element is: " + thirdLargest);
    }
    
    public static int findThirdLargest(int[] arr) {
        if (arr.length < 3) {
            System.out.println("Array has less than 3 elements.");
            return -1;
        }
        
        int firstLargest = arr[0];
        int secondLargest = arr[0];
        int thirdLargest = arr[0];
        
        for (int num : arr) {
            if (num > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = num;
            } else if (num > thirdLargest && num != secondLargest && num != firstLargest) {
                thirdLargest = num;
            }
        }
        
        return thirdLargest;
    }
}

