package Chapter2;
import java.util.Scanner;

public class switching 
{
	static Scanner stdIn = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int[] oneArray = new int[] {0,1,2,3};
		int[] twoArray = new int[] {0,1,2,3,4};
		int[] ArrayA = null;	int[] ArrayB = null;
		int numA; 	int numB;

		
		System.out.print("A Array의 range를 입력: ");
		ranger(ArrayA);
		System.out.print("B Array의 range를 입력: ");
		ranger(ArrayB);
		
		//System.out.println("B Array의 range를 입력: ");
		//numB = stdIn.nextInt();
		//ArrayB = new int[numB];
		
		//System.out.println("A Array에 들어갈 elements 입력");
		//elementer(ArrayA);
		
		System.out.println("A Array에 들어갈 elements 입력");
		for(int i = 0; i < ArrayA.length; i++)
		{
			System.out.print("입력값: ");
			ArrayA[i] = stdIn.nextInt();
		}
		
		System.out.println("B Array에 들어갈 elements 입력");
		for(int i = 0; i < ArrayB.length; i++)
		{
			System.out.print("입력값: ");
			ArrayB[i] = stdIn.nextInt();
		}
		
		System.out.print("Swithced된 A Array는: ");
		System.out.println(intArrSwitcher(ArrayA));
		
		System.out.println("B Array에 들어갈 elements 입력");
		elementer(ArrayB);
		
		System.out.print("Switched된 B Array는: ");
		System.out.println(intArrSwitcher(ArrayB));
	}
	
	
	static int[] ranger(int[] arr) //range setter
	{
		int range = stdIn.nextInt();
		arr = new int[range];
		return arr;	
	}
	
	static int[] elementer(int[] arr) //element setter
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("입력값: ");
			arr[i] = stdIn.nextInt();
		}
		
		return arr;
	}
	
	static int[] intArrSwitcher(int[] arr)
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
		//else
		//{
			
		//	}
		return arr;
	}
	
	
	
	
	
}
