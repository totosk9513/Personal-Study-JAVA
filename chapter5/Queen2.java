package chapter5;

public class Queen2 
{
	static boolean[] flag = new boolean[8]; //�� �࿡ ���� �̹� ������ �ִ��� t/fȮ��
	static int[] pos = new int[8];			//�� ���� ���� ��ġ.
	
	
	static void print()
	{
		for (int i = 0; i < 8; i++)
			System.out.printf("%2d", pos[i]);
		System.out.println();
	}
	
	
	static void set(int i)
	{
		for (int j = 0; j < 8; j++)
		{
			if (flag[j] == false)
			{
				pos[i] = j;
				if (i == 7)
					print();
				else
				{
					flag[j] = true;
					set(i + 1);
					flag[j] = false; //false�� �����ָ�  j++�������� ���� ������ �Ѿ��
									//�� �ٸ� set(i + 1)��Ͱ� ������ 
									//���� j�������� flag[j]�� true�� �ǿ��־ �ݺ��� ����
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		set(0);
	}
	
}
