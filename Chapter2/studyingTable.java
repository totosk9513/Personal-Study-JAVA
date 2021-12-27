package Chapter2;
import java.util.Scanner;


public class studyingTable 
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		arraytools tool = new arraytools();
		int[] arr1; int[] arr2;
		
		System.out.print("Arr1's Range is: ");
		arr1 = new int[stdIn.nextInt()];
		System.out.print("Arr2's Rangs is: ");
		arr2 = new int[stdIn.nextInt()];
		
		System.out.print("Input Arr1's element: ");
		tool.intArrElementIn(arr1);
		
		System.out.print("Input Arr2's element: ");
		tool.intArrElementIn(arr2);
		
		///Copy
		
		System.out.println("Coping Arr2's elements to Arr1");
		tool.copy(arr2, arr1);
		
		System.out.println("Arr1's elements are: ");
		tool.intArrPrint(arr1);
		
		System.out.println("Arr2's elements are: ");
		tool.intArrPrint(arr2);
		
		
		//
		
	}
}
