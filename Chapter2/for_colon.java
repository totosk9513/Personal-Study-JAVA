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
		
		for (double i : a) //"�迭 a�� ó������ ������ ��� elements�� �ϳ��� ��ĵ,
							//���� body������ ���� �ָ�ǰ� �ִ� element�� i��� ǥ��
		{
			sum += i; 		//���⼱ loop�� �ָ�� element�� i,
		}
		System.out.println("��� ����� ���� "+ sum + "�Դϴ�.");
		
	}
	
}
