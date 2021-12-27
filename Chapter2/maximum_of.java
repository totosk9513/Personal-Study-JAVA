package Chapter2;


public class maximum_of
{
	int maxiOf(int[] a)
	{
		int max = a[0];
		for (int i = 1; i < a.length; i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		return max;
	}
}
