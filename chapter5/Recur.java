package chapter5;
import java.util.Scanner;

public class Recur 
{
	static void recur(int n)
	{
		if (n > 0) //재귀 조건 그러니깐 n <= 0 이면 재귀 종료
		{
			recur(n - 1); //재귀 영향 알고리즘1
			System.out.println(n);
			recur(n - 2); //재귀 영향 알고리즘2
		}
	}
	
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. : ");
		int x = stdIn.nextInt();
		
		recur(x);
	}
}
