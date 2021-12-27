package Chapter2;
import java.util.Scanner;

public class Maximum_of_array 
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("누가 제일 키가 클까?");
		System.out.println("사람수 : ");
		int num = stdIn.nextInt();  //어레이 크기 값
		
		int[] height = new int[num];  //어레이 크기 값으로 height 어레이 크기를 정함
		
		for (int i = 0; i < height.length; i++)
		{
			System.out.print("height[" + i + "] : ");
			height[i] = stdIn.nextInt();
		}
		
		System.out.println("최대값은 " + maxOf(height) + "입니다.");
	}
	

	static int maxOf(int[] a)  //이때 다른곳에서 maxOf메소드에 접근할때 int[]형태로 들어가야하고
						//variable, a에 외부 접근자가 대응한다 
						//(당연히 얘도 포인터일뿐 진짜 대입은아니다)
	{
		int max = a[0];
		for (int i = 1; i < a.length; i++)
		{
			if (a[i] > max);
			{
				max = a[i]; //높은넘버의 값이 작은넘버의 값보다 크면 max로 대입
			}
		}
		return max; //int형의 메소드니깐 int값을 리턴해야함
					//외부에서 int[] var가 들어왔을때 int[] a에 대입하여 메소드 연산후
					//max값을 다시 외부로 돌려준다
	}

}
