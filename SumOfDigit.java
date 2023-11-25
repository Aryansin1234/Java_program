import java.util.Scanner;
public class SumOfDigit{
	public static void main(String[] args){
		Scanner SC = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n = SC.nextInt();
		int digit,Sum=0,temp=n;
		while(n>0){
			digit=n%10;
			Sum+=digit;
			n=n/10;
		}
		System.out.print("The sum of digit of "+temp+" is :"+Sum);
	}
}

