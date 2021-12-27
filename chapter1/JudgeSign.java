package chapter1;
import java.util.Scanner;

public class JudgeSign 
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in); //스캐너
	
		System.out.println("정수를 입력하세염");
		int x = stdIn.nextInt();
		
		if (x > 0)
		{
			System.out.println("이 수는 양수 입니다");
		}
		else if (x < 0)
		{
			System.out.println("이 수는 음수 입니다");
		}
		else
		{
			System.out.println("이 수는 0입니다");
		}
		
	
	
		
		
	}
}
