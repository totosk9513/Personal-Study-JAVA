package chapter6;
import java.util.Scanner;

public class table 
{
	public static void main(String[] args)
	{
		sortings ja = new sortings();
		Scanner stdIn = new Scanner(System.in);
		
		//System.out.println("���� ����(ver.1)");
		System.out.println("��ڼ�: ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++)
		{	
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		ja.quikSort(x);
		
		System.out.println("������������ �����߽��ϴ�.");
		for (int i = 0; i < nx; i ++)
		{
			System.out.println("x[" + i + "]=" + x[i]);
		}
	
	}
}
