package Chapter2;
import java.util.Scanner;

public class Maxof_class_use 
{
	public static void main(String[] args)
	{
		int[] a;
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����� ��: ");
		int num = stdIn.nextInt();
		a = new int[num];
		
		System.out.println("�Է��� ����� ���� ��: " + num + "�Դϴ�.");
		
		int j = 1;
		for(int i = 0; i < a.length; i++, j++)
		{
			System.out.print(j + "��° ����� Ű: ");
			a[i] = stdIn.nextInt();
			
		}
		
		maximum_of maxi = new maximum_of(); 
		//���� maxi�� maximum_of Ŭ������ ���� ���⼭ �̰����� 
		//����� �� �ְ� �ν����� �� �ϴ°�
		int max = maxi.maxiOf(a);
		
		System.out.print("�Է��� ������� ���� ���� ū Ű�� " + max + "�Դϴ�. ");
	}
}
