package chapter5;
import java.util.Scanner;	

public class factorial 
{
	static int factorial(int n)
	{
		if (n > 0)
			return n * factorial(n - 1); //메소드 안에 메소드, 내부 메소드에서 -1 하면서 0에 접근
		else
			return 1; //그래서 0되면 나옴
	}
	//요놈은 자기놈이 자기가 가는거라 직접 재귀.
}
