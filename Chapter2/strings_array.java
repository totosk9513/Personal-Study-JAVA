package Chapter2;

import java.lang.reflect.Array;

public class strings_array 
{

	public static void main(String[] args) 
	{
		int[] a = {1,2,3};
		int b = Array.getLength(a); //ArrayŬ������ getLength�޼ҵ�
		
		for (int i = 0; i < b;i++)
		{
			System.out.println(a[i]);
		}
		
		for (int k = 0; k < a.length; k++)
			//a.length�� �Ǵ� ������ a = Array�� class, primitive type�� �ƴϴ�
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
	
	//���ڿ�������
	
	

}
