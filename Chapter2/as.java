package Chapter2;
import java.util.Scanner;

public class as 
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		arraytools tool = new arraytools();
		
		int deci; int[] bin;
		
		System.out.print("Deci's value is?: ");
		deci = stdIn.nextInt();
		
		System.out.println("Convert Deci to Binary.");
		bin = tool.intDeciToArrBin(deci);
		System.out.print("Result is:");
		tool.intArrPrint(bin);
		
		CardConvRev ccr = new CardConvRev();
		
		char[] gamja = new char[888];
		System.out.print("Input a integer: ");
		int input = stdIn.nextInt();
		System.out.print("Input cardinal number: ");
		int val = stdIn.nextInt();
		
		gamja = ccr.cardConvRChar(input, val);
		tool.charArrRev(gamja);
		System.out.println("The integer, " + input + " in " + val + " cardinal is: ");
		tool.charArrPrint(gamja);

		
	}
}
