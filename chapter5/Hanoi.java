package chapter5;
import java.util.Scanner;

public class Hanoi 
{
	//no���� ������ from x��� to y���
	static void move(int no, int x, int y) 
	{
		if (no > 1)
			move(no - 1, x , 6 - x - y);
		
		System.out.println("����[" + no + "]��" + x + "��տ��� " + y + "������� ����");
		
		if (no > 1)
			move(no - 1, 6 - x - y, y);
	}
	
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�ϳ����� ž");
		System.out.print("���� ���� :");
		int n = stdIn.nextInt();
		
		move(n,1,3);
		
	}
	
	//�ϳ���ž ��Ŀ���� ��ĳ �Ǵ��� ����ϸ鼭 �����ִ� Ŭ�����̸�, �����δ� �ϳ����� ž�� ����.
}
