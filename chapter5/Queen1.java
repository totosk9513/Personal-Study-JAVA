package chapter5;

public class Queen1 
{
	static int[] pos = new int[8];
	
	
	
	static void print()
	{
		for (int i = 0; i < 8; i++)
		{
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
	}
	
	
	
	static void set(int i)
	{
		for (int j = 0; j < 8; j++)
		{
			pos[i] = j;
		if (i == 7) //i가 7이면 모든 열에 하나씩 퀸이 배치됨
			print();
		else
			set(i + 1); //재귀
		}
	}
	
	public static void main(String[] args)
	{
		set(0);
	}
}
