package chapter5;
import java.util.Scanner;	

public class recur2 
{
	static void recur22(int n)
	{
		if (n > 0)
		{
			recur22(n - 2 );
			System.out.println(n);
			recur22(n - 1);
		}
	}
	
	static void main(String[] args)
	{
		
	}
}
