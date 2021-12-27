package Chapter2;
import java.util.Scanner;

public class leapY 
{
	static int[][] mdays =
		{
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		};

	
	static int isLeap(int year)
	{
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			
			return 1;
		
		else
			return 0;
	}
	
	static int dayOfYear(int y, int m, int d)
	{
		int days = d;
		
		for (int i = 1; i < m; i ++)
			days += mdays[isLeap(y)][i - 1];
		return days;
		
	}
	
	
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int retry;
		
		System.out.println("�� �� ��� �ϼ��� ���մϴ�. ");
		
		do
		{
			System.out.print("��: ");
			int year = stdIn.nextInt();
			System.out.print("��: ");
			int month = stdIn.nextInt();
			System.out.print("��: ");
			int days = stdIn.nextInt();
			
			System.out.printf("�� �� %d��°�Դϴ�.\n", dayOfYear(year,month,days));
			
			
			System.out.print("Retry? 1 to Y, 0 to N : ");
			retry = stdIn.nextInt();
		}
		while(retry == 1);
	}
}
