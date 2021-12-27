package chapter1;
import java.util.Scanner;

public class npira 
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇단 피라미드?: ");
		int kai = stdIn.nextInt();
		
		for(int i = 1; i <= kai; i++) //column looper
		{
			for(int j = kai - i; j >=0; j--) //blank looper
			{
				System.out.print(" ");
			}
			for(int k = 1; k < i * 2; k++) //i층의 숫자가 looping 되어야 한다
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
