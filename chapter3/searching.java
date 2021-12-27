package chapter3;
import java.util.Scanner;

public class searching 
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++)
		{
			System.out.print("x[" + i + "]:");
			
			x[i] = stdIn.nextInt();
			
		}
		
	
		
		System.out.print("검색할 값: ");
		int ky = stdIn.nextInt();
		
		int n = x.length;
		
		int ans = searchTools.binSearchB(x, ky);
		
		if (ans == -1)
			System.out.println("아무것도 읎는디여.");
		
			System.out.println(ky + "은(는) x[" + ans +"]에 있습니다.");
		
		/*int idx = linear_searching.seqSearch(x, num, ky);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx +"]에 있습니다.");
			*/
	}
}
