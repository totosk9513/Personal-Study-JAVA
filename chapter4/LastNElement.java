package chapter4;
import java.util.Scanner;	

public class LastNElement 
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		final int N = 10;
		int[] a = new int[N]; //�Է¹��� �� ����
		int cnt = 0; //�Է� ���� ����
		int retry; 	//��Ʈ����?
		
		System.out.println("������ �Է��ϼ���.");
		
		do
		{
			System.out.printf("%d��° ���� :", cnt + 1);
			a[cnt++ % N] = stdIn.nextInt();  //�̰� Ȥ�� �� ����???? �׷��� ������ 
			//�³� ������ �ִ� ũ�� ��ŭ ������ ���������� �ٽ� ���ʱ�ȭ ��Ű�� ������.
		
			System.out.print("��� �ұ��? (��.1/�Ƴ�.0) : ");
			retry = stdIn.nextInt();
		}
		while (retry == 1);
		
		int i = cnt - N;
		if (i < 0) 
			i = 0;
		//���� i �� 0�̻��̶��� ������ ������ 10�� �Ѿ �ٽ� �ʱ�ȭ�� ���Ͱ� �־
		//���� ���������� ���ʱ�ȭ�� �� ���� cnt�� ���� ����� �Ѵ�.
		//0 ������ ���� ���� ������ ������ 10�� �ȳѰܱ� ������ �׳� 0���� cnt���� �����ص� ����.
		for ( ; i < cnt; i++)
			System.out.printf("%2d��°�� ���� = %d\n" , i + 1, a[i % N]	);
	
	}
}
