package Chapter2;
import java.util.Scanner;

public class equal 
{
	public static void main(String[] args)
	{
		
		Scanner stdIn = new Scanner(System.in);
		arraytools tool = new arraytools();
		
		int[] arr1; int[] arr2;
		
		System.out.print("Array1�� range: ");
		arr1 = new int[stdIn.nextInt()];
	
		System.out.print("Array2�� range: ");
		arr2 = new int[stdIn.nextInt()];
		
		System.out.println("Array1�� elements�� �Է�: ");
		tool.intArrElementIn(arr1);
		
		System.out.println("Array2�� elements�� �Է�: ");
		tool.intArrElementIn(arr2);
	
		System.out.println("Checking they both arrays have same elements");
		boolean equity = tool.intArrEqual(arr1, arr2);
		if (equity == true)
		{
			System.out.println("They both have same elements!");
			
		}
		else
		{
			System.out.println("They don't seems that they have same elements one another");
		}
		
		
	}
}
