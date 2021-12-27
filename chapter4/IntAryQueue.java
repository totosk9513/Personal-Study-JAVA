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
		
		//나중에 try catch 가 어떤건지 좀 알아보자
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
		return pop; //조금 위험한거 같은데... 만약에 que의 가 아예 0개짜리면 팝 되는 value가 없는데
	}
	
	public void dump()
	{
		if (num <= 0)
		{
			System.out.println("큐가 비어있습니당.");
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
