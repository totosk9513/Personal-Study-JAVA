package asd;
import java.util.Scanner;

public class switching2 
{
	public static void main(String[] args)
	{
		
		int[] arrayA = null; int[] arrayB = null;
		
		arraytools arrt = new arraytools();
		Scanner stdIn = new Scanner(System.in);
		
		
		System.out.print("A array의 range: ");
		arrt.ranger(arrayA);
		System.out.print("B array의 range: ");
		arrt.ranger(arrayB);
		
		System.out.println("length 값: ");
		System.out.println(arrayA.length + arrayB.length);
		
		
		System.out.print("A array의 elements 입력: ");
		//arrt.elementer(arrayA);
		for(int i = 0; i < arrayA.length; i++)
		{
			System.out.print("입력값: ");
			arrayA[i] = stdIn.nextInt();
		}
		
		System.out.print("B array의 elements 입력: ");
		for(int k = 0; k < arrayB.length; k++)
		{
			System.out.print("입력값: ");
			arrayB[k] = stdIn.nextInt();
		}
		//arrt.elementer(arrayB);
		
		
		
	}
}
