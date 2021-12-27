package Chapter2;
import java.util.Scanner;

public class Maxof_class_use 
{
	public static void main(String[] args)
	{
		int[] a;
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("사람의 수: ");
		int num = stdIn.nextInt();
		a = new int[num];
		
		System.out.println("입력한 사람의 수는 총: " + num + "입니다.");
		
		int j = 1;
		for(int i = 0; i < a.length; i++, j++)
		{
			System.out.print(j + "번째 사람의 키: ");
			a[i] = stdIn.nextInt();
			
		}
		
		maximum_of maxi = new maximum_of(); 
		//변수 maxi는 maximum_of 클래스를 지금 여기서 이곳에서 
		//사용할 수 있게 인스던스 콜 하는것
		int max = maxi.maxiOf(a);
		
		System.out.print("입력한 사람들의 중의 제일 큰 키는 " + max + "입니다. ");
	}
}
