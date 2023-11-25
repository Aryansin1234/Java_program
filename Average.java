import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
	int array[] = new int[n];
	float Avg=0;
	System.out.println("Enter the "+n+" Elements in array:");
	for(int i=0;i<n;i++)
	{
		System.out.print("Enter the "+i+" index element:");
		array[i] = sc.nextInt();
		Avg +=array[i];
	}
	System.out.print("Average of elements is "+(Avg/n));
    }
}
