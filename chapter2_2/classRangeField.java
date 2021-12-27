package chapter2_2;

public class classRangeField 
{
	private int f1;
	protected int f2;
	public int f3;
	
	static final int S1 = 0;
	
	public classRangeField()
	{
		f1 = f2 = f3 = 0;
	}

	public classRangeField(int f1, int f2, int f3)
	{
		this.f1 = f1;
		this.f2 = f2;
		this.f3 = f3;
	}
	
	public void setF1(int f)
	{
		f1 =f;
	}
	
	public int getF1()
	{
		return f1;
	}
}
