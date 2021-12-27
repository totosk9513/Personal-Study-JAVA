package Chapter2;
import java.util.Scanner;


//무작정 따라하기
public class CardConvRev 
{
	static int cardConvR(int x, int r, char[] d)
	{
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do
		{
			d[digits++] = dchar.charAt(x % r);
			x /= r;
	
		}
			while(x != 0);
			return digits;
		
	}
	
	char[] cardConvRChar(int x, int r)
	{
		int temp = x;
		int count = 0;
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		while (temp != 0)
		{
			temp = temp / r;
			count++;
		}
		char arr[] = new char[count];
		
		do
		{
			 arr[digits++] = dchar.charAt(x % r);
			 x /= r;
		}
			while(x != 0);
		return arr;
		
	}
}
