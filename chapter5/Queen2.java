package chapter5;

public class Queen2 
{
	static boolean[] flag = new boolean[8]; //그 행에 퀸을 이미 놓아져 있는지 t/f확인
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
			if (flag[j] == false)
			{
				pos[i] = j;
				if (i == 7)
					print();
				else
				{
					flag[j] = true;
					set(i + 1);
					flag[j] = false; //false를 안해주면  j++루프에서 다음 루프로 넘어가고
									//또 다른 set(i + 1)재귀가 열릴때 
									//이전 j루프에서 flag[j]가 true로 되여있어서 반복이 끊김
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		set(0);
	}
	
}
