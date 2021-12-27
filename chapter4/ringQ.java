package chapter4;

public class ringQ 
{
	private int max;
	private int front;//front�� ��ġ�� element�� ��ť �ȴ�
	private int rear;//rear��ġ�� ���ο� element�� ��ť�� �ȴ�
	private int num;
	private int[] que;
	
	public class OverflowIntQueueException extends RuntimeException
	{
		public OverflowIntQueueException() {}
	}
	
	public class EmptyIntQueueException extends RuntimeException
	{
		public EmptyIntQueueException()	{}
	}
	
	public ringQ(int capacity)
	{
		num = front = rear = 0;
		max = capacity;
		
		try
		{
			que = new int[max];
		}
		catch (OutOfMemoryError e)
		{
			max = 0;
		}
	}
	
	public int enque(int x) throws OverflowIntQueueException
	{
		if (num >= max)
			throw new OverflowIntQueueException(); //����ó���� �Ǹ� throw�� �޼ҵ尡 ����
		
		que[rear++] = x;
		num++; // num�� elements����
		
		if (rear == max)
			rear = 0; //�׷��� �ƹ��� rear�� overflow�� �Ǵ°�찡 �־ element���� overflow�� �ȵǸ�
						//rear�� 0���� �ʱ�ȭ�ǰ� �ٽ� ���ۺ���
		return x;//��ť�� element �ٵ� ��� �� �����ϴ��� �� �𸣰ڴ�..... ��ť�� ���� ������ �ٽ� �ҷ����°���..
	}
	
	public int deque() throws EmptyIntQueueException
	{
		if (num <= 0)
			throw new EmptyIntQueueException();
		
		int x = que[front++];
		num--;
		
		if (front == max)
			front = 0; //���� �ִ� rear == max�� ����
		return x; //��ť�Ǵ°� element�� �����ü� �մ�.
	}
	
	public int peek() throws EmptyIntQueueException
	{
		if (num <= 0)
			throw new EmptyIntQueueException();
		return que[front];
	}
	
	public int indexOf(int x)
	{
		for (int i = 0; i < num; i ++)
		{
			int idx = (i + front) % max; //<-�̰� �˰����� ����?
			if (que[idx] == x) 
				return idx;
		}
		
		return -1;
	}
	
	public void clear()
	{
		num = front = rear = 0; //�ε������� ���ۺ��� ���ٺ��� ���� 0���� �ʱ�ȭ �ؾ���  
								//���߿� �̻��Ѱ��� ��ť�Ǵ°� ����
	}
	
	public int capacity()
	{
		return max;
	}
	
	public int size()
	{
		return num;
	}
	
	public boolean isEmpty()
	{
		return num >= max;
	}
	
	public boolean isFull()
	{
		return num >= max;
	}
	
	public void dump()
	{
		if (num <= 0)
		{
			System.out.println("ť�� ��� �ֽ��ϴ�.");
		}
		else
		{
			for (int i = 0; i < num; i ++)
			{
				System.out.print(que[(i + front) % max] + " ");
			}
			System.out.println();
		}
	}
}
