import java.util.Scanner;
public class Sum{
	public static void main(String[] args){
		Scanner SC = new Scanner(System.in);
		System.out.print("First number:");
		int x = SC.nextInt();
		System.out.print("Second Number:");
		int y = SC.nextInt();
		int sum = x+y;
		System.out.println("The sum is :"+sum);
	}
}

