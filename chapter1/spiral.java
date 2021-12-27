package chapter1;
import java.util.Scanner;

public class spiral 
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇단 피라미드?: ");
		int kai = stdIn.nextInt();
		
		for(int i = 1; i <= kai; i++) //층을 올리는 for 문
		{
			for(int j = kai - i; j >= 0; j--) //블랭크를 입력하는 for문
			{
				System.out.print(" ");
			}
			for(int k = 1; k < i * 2; k++ ) //아스테리아를 입력하는 for문
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}
//   *    	1	kai가 4일경우  3칸블랭크		1+2*0
//  ***		3				2칸 블랭크		1+2*1
// *****	5				1칸 블랭크		1+2*2
//*******	7				없음			1+2*3