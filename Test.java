import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner SC = new Scanner(System.in);
		System.out.print("Enter the number");
		int N = SC.nextInt();
		int temp=N,sum=0,R;
		while(temp>0){
			R=temp%2;
			sum+=R;
			temp/=2;
		}
		if(sum==1)
			System.out.println("The number is in power of 2");
		else
			System.out.print("It is not");
	}
}


