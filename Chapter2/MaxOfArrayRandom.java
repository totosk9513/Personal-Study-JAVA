package Chapter2;
import java.util.Scanner;
import java.util.Random;


public class MaxOfArrayRandom 
{
	public static void main(String[] args)
	{
		Random rand = new Random();  //Random 클래스형의 변수
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구하자.");
		System.out.print("사람 수 : ");
		int num = stdIn.nextInt();
		int[] array = new int[num];
		
		System.out.println("총 사람 수는: " + num + "입니다.");
		//System.out.println("사람들의 키를 입력하세요.");
		
		int j = 1;
		for (int i =0; i < array.length; i++, j++)
		{	
			array[i] = 100 + rand.nextInt(90);	//rand.nextInt(랜덤숫자 범위)
			System.out.println(j + "번째 사람의 키는: " + array[i] + "입니다");
		}
		
		maximum_of max = new maximum_of();
		
		int maxHeight = max.maxiOf(array);
		
		System.out.println("제일 큰 키는: " + maxHeight + "입니다." );
	}
}
