package chapter6;
import java.util.Scanner;

public class table 
{
	public static void main(String[] args)
	{
		sortings ja = new sortings();
		Scanner stdIn = new Scanner(System.in);
		
		//System.out.println("버블 정렬(ver.1)");
		System.out.println("요솟수: ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++)
		{	
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		ja.quikSort(x);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i ++)
		{
			System.out.println("x[" + i + "]=" + x[i]);
		}
	
	}
}
