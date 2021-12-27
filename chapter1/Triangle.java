package chapter1;
import java.util.Scanner;
public class Triangle 
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		System.out.print("¸î´Ü »ï°¢Çü?: ");
		int kai = stdIn.nextInt();
		
		for(int i = 1; i <= kai; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
