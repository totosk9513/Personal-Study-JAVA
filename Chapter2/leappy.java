package Chapter2;
import java.util.Scanner;
public class leappy 

{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		leapYearTools tool = new leapYearTools();
		int y; int m; int d;
		int retry;
		
		do
		{
			System.out.print("Year: ");
			y = stdIn.nextInt();
			System.out.print("Month: ");
			m = stdIn.nextInt();
			System.out.print("Day: ");
			d = stdIn.nextInt();

			System.out.println("Spent days of the year is: " + tool.spentDaysOfYear(y, m, d));
			
			System.out.println("Left days of the year is: " + tool.leftDaysOfYear(y, m, d));
			
			System.out.print("1 for retry, 0 for finish: ");
			retry = stdIn.nextInt();
		}
		while (retry == 1);
	}
}
