package chapter1;
import java.util.Scanner;

public class npira 
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��� �Ƕ�̵�?: ");
		int kai = stdIn.nextInt();
		
		for(int i = 1; i <= kai; i++) //column looper
		{
			for(int j = kai - i; j >=0; j--) //blank looper
			{
				System.out.print(" ");
			}
			for(int k = 1; k < i * 2; k++) //i���� ���ڰ� looping �Ǿ�� �Ѵ�
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
