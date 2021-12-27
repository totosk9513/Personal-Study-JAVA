package chapter4;

public class ringQ 
{
	private int max;
	private int front;//front에 위치한 element가 디큐 된다
	private int rear;//rear위치에 새로운 element가 인큐가 된다
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
			throw new OverflowIntQueueException(); //예외처리가 되면 throw로 메소드가 종료
		
		que[rear++] = x;
		num++; // num은 elements갯수
		
		if (rear == max)
			rear = 0; //그래서 아무리 rear가 overflow가 되는경우가 있어도 element수가 overflow가 안되면
						//rear는 0으로 초기화되고 다시 빙글빙글
		return x;//인큐된 element 근데 얘는 왜 리턴하는지 잘 모르겠다..... 인큐된 값을 뭐때매 다시 불러오는건지..
	}
	
	public int deque() throws EmptyIntQueueException
	{
		if (num <= 0)
			throw new EmptyIntQueueException();
		
		int x = que[front++];
		num--;
		
		if (front == max)
			front = 0; //위에 있는 rear == max랑 같다
		return x; //디큐되는거 element를 가져올수 잇다.
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
			int idx = (i + front) % max; //<-이거 알고리즘이 머지?
			if (que[idx] == x) 
				return idx;
		}
		
		return -1;
	}
	
	public void clear()
	{
		num = front = rear = 0; //인덱스들이 빙글빙글 돌다보니 모든걸 0으로 초기화 해야지  
								//도중에 이상한곳에 인큐되는걸 막음
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
			System.out.println("큐가 비어 있습니다.");
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
