package chapter4;

public class IntAryQueue 
{
	private int max;
	private int num;
	private int[] que;
	
	
	
	public class EmptyIntStackException extends RuntimeException
	{
		public EmptyIntStackException() {}
	}
	
	public class OverflowIntStackException extends RuntimeException
	{
		public OverflowIntStackException()	{}
	}
	
	
	public IntAryQueue(int capacity)
	{
		max = capacity;
		num = 0;
		try
		{
			que = new int[max];
		} catch (OutOfMemoryError e)
		{
			max = 0;
		}
		
		//���߿� try catch �� ����� �� �˾ƺ���
	}
	
	public int inq(int x) throws OverflowIntStackException
	{
		if (num >= max)
			throw new OverflowIntStackException();
		return que[num++] = x;
	}
	
	public int deq(int x) throws EmptyIntStackException
	{
		int pop = que[0];
		if (num <= 0)
			throw new EmptyIntStackException();
		else
		{
			for(int i = 1; i < num; i++)
			{
				que[i - 1] = que[i]; 
			}
		}
		return pop; //���� �����Ѱ� ������... ���࿡ que�� �� �ƿ� 0��¥���� �� �Ǵ� value�� ���µ�
	}
	
	public void dump()
	{
		if (num <= 0)
		{
			System.out.println("ť�� ����ֽ��ϴ�.");
		}
		else
		{
			for (int i = 0; i < num; i++)
			{
				System.out.print(que[i] + " ");
			}
			System.out.println();
		}
	}
}
