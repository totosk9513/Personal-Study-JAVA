package chapter1;
import java.util.Scanner;

public class JudgeSign 
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in); //��ĳ��
	
		System.out.println("������ �Է��ϼ���");
		int x = stdIn.nextInt();
		
		if (x > 0)
		{
			System.out.println("�� ���� ��� �Դϴ�");
		}
		else if (x < 0)
		{
			System.out.println("�� ���� ���� �Դϴ�");
		}
		else
		{
			System.out.println("�� ���� 0�Դϴ�");
		}
		
	
	
		
		
	}
}
