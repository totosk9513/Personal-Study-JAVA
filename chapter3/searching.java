package chapter3;
import java.util.Scanner;

public class searching 
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��ڼ�: ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++)
		{
			System.out.print("x[" + i + "]:");
			
			x[i] = stdIn.nextInt();
			
		}
		
	
		
		System.out.print("�˻��� ��: ");
		int ky = stdIn.nextInt();
		
		int n = x.length;
		
		int ans = searchTools.binSearchB(x, ky);
		
		if (ans == -1)
			System.out.println("�ƹ��͵� ���µ�.");
		
			System.out.println(ky + "��(��) x[" + ans +"]�� �ֽ��ϴ�.");
		
		/*int idx = linear_searching.seqSearch(x, num, ky);
		
		if(idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky + "��(��) x[" + idx +"]�� �ֽ��ϴ�.");
			*/
	}
}
