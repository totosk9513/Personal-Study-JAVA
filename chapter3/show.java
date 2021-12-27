package chapter3;
import java.util.Scanner;
public class show 
{
	public static void main(String[] args)
	{
		int[] arr;
		Scanner stdIn = new Scanner(System.in);
		System.out.println("Input length of an int array: ");
		arr = new int[stdIn.nextInt()];
		
		arraytools tool = new arraytools();
		tool.intArrElementIn(arr) ;
	
		searchShow show = new searchShow();
		show.intlinearShow(arr, 3);
		
	}
}
