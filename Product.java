import java.util.Scanner;
public class Product{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array:");
		int n = sc.nextInt();
		int array[]= new int[n];
		System.out.println("Enter "+ n + " Element in array:");
		for(int i = 0;i<n;i++){
			System.out.print("Enter the "+ i +" index element:");
			array[i] = sc.nextInt();
		}
		int Left[] = new int[n];
		int Right[] = new int[n];
		int product[] = new int[n];
		int i, j;

	 	Left[0]=1;
		Right[n-1]=1;

		for(i=1;i<n;i++){
			Left[i]=array[i-1]*Left[i-1];
		}
		for(j=n-2;j>=0;j--){
			Right[j]=array[j+1]*Right[j+1];
		}
		for(i=0;i<n;i++){
			product[i]= Left[i]*Right[i];
		}
		System.out.println("Product array:");
		for(i=0;i<n;i++){
			System.out.println("Element at "+i+" index is: "+product[i]); }
	}
}
		
