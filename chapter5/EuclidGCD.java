package chapter5;
import java.util.Scanner;

public class EuclidGCD 
{
	static int gcd(int x, int y)
	{
		if (y == 0)
			return x;
		else
			return gcd(y, x % y);
		//�߿��Ѱ� (y, x % y)�̰� �̰� �� ��� ���� 
		// x�ڸ����� y, y�ڸ����� (x % y) �� ���� ��͸� �ϸ� 
		// (x % y), (y % (x % y)), ù ��Ͷ� y�ڸ��� �־��� x % y�� x��, 
		// �׸��� x�ڸ��� �� y�� y �ڸ��� �ִ� x % y�� �������� ���ϰ�.... �̷�������
		
		//�׷��� ���� ÷���� ū ���� ���� ������ �������Ұ� ���� �����Ǵµ�, ���� �� % ū ���� �ϸ� (ex 8, 22)
		//�׳� ���� ������ �������� ������ y�ڸ� �ִ� ū ���̴� 22 x �ڸ��� ���� y �ڸ����� ������ ���� �������� 8��
		// 22, 8�̶� �ϴ°Ŷ� ���� ����. �׷��� ��ġ �ٲ��� ���� �� �ʿ�� ����
		// �ù� ��Ͱ� ������ �ƴµ� ��͵Ǵ� �˰����� �ް����� �̷��� �ȴٴϱ� �ǳ�;;
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ� ������� ���մϴ�.");
		
		System.out.println("������ �Է��ϼ���. : ");
		int x = stdIn.nextInt();
		
		System.out.println("������ �Է��ϼ���. : ");
		int y = stdIn.nextInt();
		
		System.out.println("�ִ������� " + gcd(x,y) + "�Դϴ�.");
		
	}
}
