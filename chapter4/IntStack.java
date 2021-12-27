package chapter4;

public class IntStack 
{
	private int max;
	private int ptr;
	private int[] stk;
	
	public class EmptyIntStackException extends RuntimeException
	{
		public EmptyIntStackException() {}
	}
	
	public class OverflowIntStackException extends RuntimeException
	{
		public OverflowIntStackException() {}
	}
	
	public IntStack(int capacity) //constructor
	{
		ptr = 0;
		max = capacity;
		try 
		{
			stk = new int[max];
		} catch (OutOfMemoryError e)
		{
			max = 0;
		}
	}

	public int push (int x) throws OverflowIntStackException //푸시
	{
		if (ptr >= max)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	
	public int pop() throws EmptyIntStackException 		//팝, 얘는 실제로는 안빠지지만 index로 장난쳐서
														//빼는것 처럼 가능, 스토리지에 데이터가 저장/제거 되는방식이랑 같다
	{
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	
	public int peek() throws EmptyIntStackException 	//마지막 인덱스의 값, 꼭대기 값이 뭔지 알려주는 메소드
	{
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}
	
	public int indexOf(int x)
	{
		for (int i = ptr -1 ; i >= 0; i--)
		{
			if (stk[i] == x)
			{
				return i;
			}
		}
		return -1;
	}
	
	//여기서 부턴 연습문제에서 지시된 메소드들이당
	
	public void clear() //인덱스 값을 0으로 initialize 하여 다시 처음부터 스택할수 있도록 함
	{
		ptr = 0;
	}
	
	public int capacity()
	{
		return max;
	}
	
	public int size() //현재까지 스택에 쌓여있는 데이터 수를 리턴
	{
		return ptr;
	}
	
	public boolean isEmpty()
	{
		return ptr <= 0 ;
	}
	
	public boolean isFull()
	{
		return ptr >= max;
	}
	
	public void dump() //아래에서 위로 스택에 있는 값을 출력
	{
		if (ptr <= 0)
			System.out.println("스택이 비어 있습니다.");
		else
		{
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
	
	
	
}
