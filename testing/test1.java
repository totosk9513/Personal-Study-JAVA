package testing;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int x,y;
		
		System.out.print("type value of x: ");
		x = stdIn.nextInt();
	
		System.out.print("type value of y: ");
		y = stdIn.nextInt();
		
		int z = x + y;
		double g = (x + y)/2.0;
		
		
		
		System.out.println("Choose what you want to calculate:");
		System.out.println("a: sum");
		System.out.println("b: avg");
		char decider = stdIn.next().charAt(0);
		
		if(decider == 'a')
		{
			System.out.print("The SUM of the numbers is: ");
			System.out.println(z);
		}
		else if (decider == 'b')
		{
			System.out.print("The AVG of the numbers is: ");
			System.out.println(g);
		}
		else
		{
			System.out.println("Please type only a or b not else");
		}
	
	}

}
