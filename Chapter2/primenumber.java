package Chapter2;

public class primenumber 
{
	public static void main(String[] args)
	{
		int count = 0;
		
		for (int n = 2; n <= 1000; n++)  // 2���� 1000����....
		{
			int i;
			for (i = 2; i <n; i++) //�� ���� �Ҽ����� �ƴ��� Ȯ��, 2~�� �� ���� �������� �������� üũ
			{
				count++;
				if(n % i == 0)
					break;
			}
			if (n == i)
				System.out.println(n);
		}
		
		System.out.println("�������� ������ Ƚ��: " + count);
	}
}
