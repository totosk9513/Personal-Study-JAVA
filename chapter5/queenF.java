package chapter5;


public class queenF
{
	
	static boolean[] flag_a = new boolean[8]; //그 행에 퀸을 이미 놓아져 있는지 t/f확인
	static boolean[] flag_b = new boolean[15]; // / 대각선 방향으로 퀸이 배치되여있는지
	static boolean[] flag_c = new boolean[15]; // \ 대각선 방향으로 퀸이 배치 되여 있는지
	static int[] pos = new int[8];			//각 열에 퀸의 위치.
	
	
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
			if (flag_a[j] == false &&			//j행에 배치를 안함
				flag_b[i + j] == false &&		// /대각선에 배치를 안함
				flag_c[7 - i  + j] == false)		// \대각선에 배치를 안함
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

