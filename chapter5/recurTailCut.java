package chapter5;

public class recurTailCut 
{
	static void recurX(int n)
	{
		while(n > 0)
		{
			recurX(n - 1);
			System.out.println(n);
			n = n - 2;
		}
	}
	//��� ��ʹ� n���� ���� ���鼭 �ݺ��ϴµ�, �ڱ� �Լ� ������ iteration���� ��ü�ϸ鼭
	//�귣ġ�� ���� �ʴ´�. recur(n - 2)�� ������Ϳ��µ� �̰� �Ϲ� �ݺ������� �ϸ鼭 �ٲٴ°�.
	
	static void recur(int n)
	{
		recur(n - 1);
		System.out.println(n);
		recur(n - 2);
	}
	
	//�̰Ŵ� ��͸� 2^n���� ���� �� ���鼭 �ݺ�, Ʈ��ó�� ��� ������� �����̸�, 
	//���� �귣ġ�� ������ ���� �귣ġ�� �Ѿ �� �ֳ�
}
