package Chapter2;

import java.lang.reflect.Array;

public class strings_array 
{

	public static void main(String[] args) 
	{
		int[] a = {1,2,3};
		int b = Array.getLength(a); //Array클래스의 getLength메소드
		
		for (int i = 0; i < b;i++)
		{
			System.out.println(a[i]);
		}
		
		for (int k = 0; k < a.length; k++)
			//a.length가 되는 이유는 a = Array는 class, primitive type이 아니다
		{
			System.out.print(a[k]);
		}

		System.out.println();
		
		int[] clone = a.clone();
		
		for (int j = 0; j < clone.length;j++)
		{
			System.out.print(clone[j]);
		}
		System.out.println();
		
	}
	
	//문자여여여열
	
	

}
