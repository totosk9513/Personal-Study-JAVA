package asd;
import java.util.Scanner;

public class switching2 
{
	public static void main(String[] args)
	{
		
		int[] arrayA = null; int[] arrayB = null;
		
		arraytools arrt = new arraytools();
		Scanner stdIn = new Scanner(System.in);
		
		
		System.out.print("A array�� range: ");
		arrt.ranger(arrayA);
		System.out.print("B array�� range: ");
		arrt.ranger(arrayB);
		
		System.out.println("length ��: ");
		System.out.println(arrayA.length + arrayB.length);
		
		
		System.out.print("A array�� elements �Է�: ");
		//arrt.elementer(arrayA);
		for(int i = 0; i < arrayA.length; i++)
		{
			System.out.print("�Է°�: ");
			arrayA[i] = stdIn.nextInt();
		}
		
		System.out.print("B array�� elements �Է�: ");
		for(int k = 0; k < arrayB.length; k++)
		{
			System.out.print("�Է°�: ");
			arrayB[k] = stdIn.nextInt();
		}
		//arrt.elementer(arrayB);
		
		
		
	}
}
