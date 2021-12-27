package Chapter2;
import java.util.Scanner;

public class for_colon 

{
	public static void main(String[] args) 
	{
		double[] a = { 1.0, 2.0, 3.0, 4.0, 5.0};
		
		for(int i = 0; i < a.length; i ++)
		{
			System.out.println("a[" + i + "] = " + a[i]);
			
		}
		double sum = 0;
		
		for (double i : a) //"배열 a의 처음부터 끝까지 모든 elements를 하나씩 스캔,
							//루프 body에서는 현재 주목되고 있는 element를 i라고 표현
		{
			sum += i; 		//여기선 loop중 주목된 element가 i,
		}
		System.out.println("모든 요소의 합은 "+ sum + "입니다.");
		
	}
	
}
