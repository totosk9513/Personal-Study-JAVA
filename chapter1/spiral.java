package chapter1;
import java.util.Scanner;

public class spiral 
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��� �Ƕ�̵�?: ");
		int kai = stdIn.nextInt();
		
		for(int i = 1; i <= kai; i++) //���� �ø��� for ��
		{
			for(int j = kai - i; j >= 0; j--) //��ũ�� �Է��ϴ� for��
			{
				System.out.print(" ");
			}
			for(int k = 1; k < i * 2; k++ ) //�ƽ��׸��Ƹ� �Է��ϴ� for��
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}
//   *    	1	kai�� 4�ϰ��  3ĭ��ũ		1+2*0
//  ***		3				2ĭ ��ũ		1+2*1
// *****	5				1ĭ ��ũ		1+2*2
//*******	7				����			1+2*3