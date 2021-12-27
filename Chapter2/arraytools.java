package Chapter2;
import java.util.Scanner;

public class arraytools 
{
Scanner stdIn = new Scanner(System.in);
	

////////////////////////////////////////int///////////////////////////////////////
	void intArrPrint(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	void charArrPrint(char[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	int[] intArrElementIn(int[] arr)  
	{
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = stdIn.nextInt();
		}
		return arr;
	}
	
	int[] intArrRanger(int[] arr, int num)  //문제가 있다 근데 왜그런지 모르겠다
	{
		arr = new int[num];
		return arr;
	}
	
	int[] intArrRev(int[] arr)
	{
		int temp;
		for(int i = 0; i < arr.length / 2; i++)
		{
			temp = arr[i];
			arr[i] = arr[arr.length - (1 + i)];
			arr[arr.length - (1 + i)] = temp;
					
		}
		return arr;
	}
	
		
	
	int[] intArrSwap(int[] arr, int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
		return arr;
	}
	
	int	intArrWTFRU(int[] arr, int ind)
	{
		return arr[ind];
	}
	
	boolean intArrEqual(int[] arr1, int arr2[])
	{
		if (arr1.length != arr2.length)
		{
			return false;
		}
		else
		{
			for (int i = 0; i < arr1.length; i++)
			{
				if (arr1[i] != arr2[i])
				{
					return false;
				}
			}
			return true;
		}
		
	}
	
	int[] copy(int[] copier, int[] copiand)
	{
		if (copier.length != copiand.length)
		{
			System.out.println("They both does not have same length");
			System.out.println("Copied failed");
			return null;
		}
		else 
		{
			for(int i = 0; i < copier.length; i++)
			{
				copiand[i] = copier[i];
			}
			System.out.println("Copy processed");
			return copiand;
		}
		
	}
	
	int[] intDeciToArrBin(int deci)
	{
		int quti = deci; int i;
		for (i = 0; quti > 0; i++)
		{
			quti = quti / 2;
			
		}
		//num가 몇번 나눌수 있는지 알려준다 (몇 제곱이 나오는지 알려준다)
		
		int[] bin = new int[i];
		int temp = deci;
		for (int j = 0; temp > 0 ; j++)
		{
			bin[bin.length - (1 + j)] = temp % 2;
			temp = temp /2;
		}
		return bin;
	}
	
	//int intArrWherTFRU 서처!
	
	
	
	//////////////////////////////char//////////////////////////////////////
	
	char[]	charArrRev(char[] arr)
	{
		char temp;
		for(int i = 0; i < arr.length / 2; i++)
		{
			temp = arr[i];
			arr[i] = arr[arr.length - (1 + i)];
			arr[arr.length - (1 + i)] = temp;
					
		}
		return arr;
	}
	
	char[] charArrCcv(int x, int r)  //cardinal number switcher. 
	//REQUIRED ELEMENTS REVERSE!
	{
		int temp = x;
		int count = 0;
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		while (temp != 0)
		{
			temp = temp / r;
			count++;
		}
		char arr[] = new char[count];
		
		do
		{
			 arr[digits++] = dchar.charAt(x % r);
			 x /= r;
		}
			while(x != 0);
		return arr;
		
	}
}
