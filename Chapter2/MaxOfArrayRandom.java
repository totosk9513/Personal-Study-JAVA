package Chapter2;
import java.util.Scanner;
import java.util.Random;


public class MaxOfArrayRandom 
{
	public static void main(String[] args)
	{
		Random rand = new Random();  //Random Ŭ�������� ����
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("Ű�� �ִ밪�� ������.");
		System.out.print("��� �� : ");
		int num = stdIn.nextInt();
		int[] array = new int[num];
		
		System.out.println("�� ��� ����: " + num + "�Դϴ�.");
		//System.out.println("������� Ű�� �Է��ϼ���.");
		
		int j = 1;
		for (int i =0; i < array.length; i++, j++)
		{	
			array[i] = 100 + rand.nextInt(90);	//rand.nextInt(�������� ����)
			System.out.println(j + "��° ����� Ű��: " + array[i] + "�Դϴ�");
		}
		
		maximum_of max = new maximum_of();
		
		int maxHeight = max.maxiOf(array);
		
		System.out.println("���� ū Ű��: " + maxHeight + "�Դϴ�." );
	}
}
