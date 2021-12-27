package chapter6;
import java.util.Scanner;

public class showTable 
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		sortingShow show = new sortingShow();
		
		System.out.println("Input the element number: ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		
		for(int i = 0; i < nx; i++)
		{	
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		show.selectionSort_Show(x);
		
		//System.out.println("Choose the type of show of a sorting.: ");
	}
	
}
