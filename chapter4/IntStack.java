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

	public int push (int x) throws OverflowIntStackException //Ǫ��
	{
		if (ptr >= max)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	
	public int pop() throws EmptyIntStackException 		//��, ��� �����δ� �Ⱥ������� index�� �峭�ļ�
														//���°� ó�� ����, ���丮���� �����Ͱ� ����/���� �Ǵ¹���̶� ����
	{
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	
	public int peek() throws EmptyIntStackException 	//������ �ε����� ��, ����� ���� ���� �˷��ִ� �޼ҵ�
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
	
	//���⼭ ���� ������������ ���õ� �޼ҵ���̴�
	
	public void clear() //�ε��� ���� 0���� initialize �Ͽ� �ٽ� ó������ �����Ҽ� �ֵ��� ��
	{
		ptr = 0;
	}
	
	public int capacity()
	{
		return max;
	}
	
	public int size() //������� ���ÿ� �׿��ִ� ������ ���� ����
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
	
	public void dump() //�Ʒ����� ���� ���ÿ� �ִ� ���� ���
	{
		if (ptr <= 0)
			System.out.println("������ ��� �ֽ��ϴ�.");
		else
		{
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
	
	
	
}
