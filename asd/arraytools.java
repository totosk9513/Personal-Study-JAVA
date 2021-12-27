package asd;
import java.util.Scanner;

public class arraytools 
{
	static Scanner stdIn = new Scanner(System.in);
	
	int[] ranger(int[] arr) //range setter
	{
		int range = stdIn.nextInt();
		arr = new int[range];
		return arr;	
	}
	
	int[] elementer(int[] arr) //element setter
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("ÀÔ·Â°ª: ");
			arr[i] = stdIn.nextInt();
		}
		
		return arr;
	}
	
	int[] intArrSwap(int[] arr) //element swapper
	{
		int temp;
		if ((arr.length)%2 == 0)
		{
			for(int i = 0; i < arr.length / 2; i++)
			{
				temp = arr[i];
				arr[i] = arr[arr.length - (1 + i)];
				arr[arr.length - (1 + i)] = temp;
			}
		}
	
		return arr;
	}
}
