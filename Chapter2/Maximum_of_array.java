package Chapter2;
import java.util.Scanner;

public class Maximum_of_array 
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� ���� Ű�� Ŭ��?");
		System.out.println("����� : ");
		int num = stdIn.nextInt();  //��� ũ�� ��
		
		int[] height = new int[num];  //��� ũ�� ������ height ��� ũ�⸦ ����
		
		for (int i = 0; i < height.length; i++)
		{
			System.out.print("height[" + i + "] : ");
			height[i] = stdIn.nextInt();
		}
		
		System.out.println("�ִ밪�� " + maxOf(height) + "�Դϴ�.");
	}
	

	static int maxOf(int[] a)  //�̶� �ٸ������� maxOf�޼ҵ忡 �����Ҷ� int[]���·� �����ϰ�
						//variable, a�� �ܺ� �����ڰ� �����Ѵ� 
						//(�翬�� �굵 �������ϻ� ��¥ �������ƴϴ�)
	{
		int max = a[0];
		for (int i = 1; i < a.length; i++)
		{
			if (a[i] > max);
			{
				max = a[i]; //�����ѹ��� ���� �����ѹ��� ������ ũ�� max�� ����
			}
		}
		return max; //int���� �޼ҵ�ϱ� int���� �����ؾ���
					//�ܺο��� int[] var�� �������� int[] a�� �����Ͽ� �޼ҵ� ������
					//max���� �ٽ� �ܺη� �����ش�
	}

}
