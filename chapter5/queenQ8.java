package chapter5;


public class queenQ8
{
	
	static boolean[] flag_a = new boolean[8]; //�� �࿡ ���� �̹� ������ �ִ��� t/fȮ��
	static boolean[] flag_b = new boolean[15]; // / �밢�� �������� ���� ��ġ�ǿ��ִ���
	static boolean[] flag_c = new boolean[15]; // \ �밢�� �������� ���� ��ġ �ǿ� �ִ���
	static int[] pos = new int[8];			//�� ���� ���� ��ġ.
	
	
	static void print()
	{
		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				if (pos[i] == j)
					System.out.print("�� ");
				else
					System.out.print("�� ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	static void set(int i)
	{
		for (int j = 0; j < 8; j++)
		{
			if (flag_a[j] == false &&			//j�࿡ ��ġ�� ����
				flag_b[i + j] == false &&		// /�밢���� ��ġ�� ����
				flag_c[7 - i  + j] == false)		// \�밢���� ��ġ�� ����
			{
				pos[i] = j;
				if (i == 7)
					print();
				else
				{
					flag_a[j] = flag_b[i + j] = flag_c[7 - i  + j] = true;
					set(i + 1);
					flag_a[j] = flag_b[i + j] = flag_c[7 - i  + j] = false; 
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		set(0);
	}
	
}

