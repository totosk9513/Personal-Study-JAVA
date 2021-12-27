package chapter5;
import java.util.Scanner;

public class EuclidGCD 
{
	static int gcd(int x, int y)
	{
		if (y == 0)
			return x;
		else
			return gcd(y, x % y);
		//중요한게 (y, x % y)이고 이게 더 깊게 들어가면 
		// x자리에는 y, y자리에는 (x % y) 한 번더 재귀를 하면 
		// (x % y), (y % (x % y)), 첫 재귀때 y자리에 있었던 x % y가 x로, 
		// 그리고 x자리로 간 y를 y 자리에 있던 x % y로 나머지를 구하고.... 이런식으로
		
		//그러다 보니 첨에는 큰 놈을 작은 놈으로 나눠야할거 같다 생각되는데, 작은 놈 % 큰 놈을 하면 (ex 8, 22)
		//그냥 작은 놈으로 나머지로 나오고 y자리 있던 큰 놈이던 22 x 자리로 가고 y 자리에는 나눠서 나온 나머지인 8로
		// 22, 8이랑 하는거랑 같게 나옴. 그래서 위치 바껴도 걱정 할 필요는 없네
		// 시발 재귀가 먼지는 아는데 재귀되는 알고리즘이 햇갈리면 이렇게 된다니깐 맨날;;
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("두 정수의 최대 공약수를 구합니다.");
		
		System.out.println("정수를 입력하세요. : ");
		int x = stdIn.nextInt();
		
		System.out.println("정수를 입력하세요. : ");
		int y = stdIn.nextInt();
		
		System.out.println("최대공약수는 " + gcd(x,y) + "입니다.");
		
	}
}
