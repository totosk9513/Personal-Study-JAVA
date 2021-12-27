package Chapter2;

public class leapYearTools 
{
	int[][] mdays = 
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //365 Æò
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //366 À±
		};
	
	
	
	int isLeap(int year)
	{
		if ((year % 4 == 0)&& (year % 100 != 0) || (year % 400 == 0))
		{
			return 1;
		}
		else
			return 0;
		
	}
	
	int spentDaysOfYear(int y, int m, int d)
	{
		int days = d;
		for(int i = 1; i < m; i++)
		{
			days = days + mdays[isLeap(y)][i - 1];
		}
		return days;
	}
	
	int leftDaysOfYear(int y, int m, int d)
	{
		int days = d;
		for (int i = 1; i < m; i++)
		{
			days = days + mdays[isLeap(y)][i - 1];
		}
		if (isLeap(y) == 1)
		{
			return 366 - days;
		}
		else
			return 365 - days;
	}
	
}
