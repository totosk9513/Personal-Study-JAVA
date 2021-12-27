package chapter4;

public class doublestak 
{
	private int max;
	private int lptr;
	private int rptr;
	private int[] stk;
	
	public class EmptyIntStackException extends RuntimeException
	{
		public EmptyIntStackException() {}
	}
	
	public class OverflowIntStackException extends RuntimeException
	{
		public OverflowIntStackException() {}
	}
	
	public doublestak(int capacity)
	{
		max = capacity;
		lptr = 0;
		rptr = max - 1;
	}
	
	public int lpush(int x) throws OverflowIntStackException
	{
		if (lptr >= max)
			throw new OverflowIntStackException();
		else if(lptr >= rptr)
			++rptr;
		return stk[lptr++] = x;
	}
	
	public int rpush(int x) throws OverflowIntStackException
	{
		if (rptr < 0)
			throw new OverflowIntStackException();
		else if(rptr <= lptr)
			--lptr;
		return stk[rptr--] = x;
	}
	
	public int lpop() throws EmptyIntStackException
	{
		if (lptr <= 0)
			throw new EmptyIntStackException();
		return stk[--lptr];
	}
	
	public int rpop() throws EmptyIntStackException
	{
		if (rptr >= max)
			throw new EmptyIntStackException();
		return stk[++rptr];
	}
	
	public int lpeak() throws EmptyIntStackException
	{
		if(lptr <= 0)
			throw new EmptyIntStackException();
		return stk[lptr - 1];
	}
	
	public int rpeak() throws EmptyIntStackException
	{
		if (rptr >= max)
			throw new EmptyIntStackException();
		return stk[rptr + 1];
	}
	
	
	
}
