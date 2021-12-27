package chapter6;

public class sortingShow 
{
	
	void swap(int[] a, int idx1, int idx2)
	{
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	void bubbleSort_Raw_Show (int[]a)
	{
		for (int i = 0; i < a.length - 1; i++)
		{
			System.out.println("패스" + i + ":");
			
			for (int j = a.length - 1; j > i; j--)
			{
				if (a[j - 1] > a[j])
				{
					for (int k = 0; k < a.length; k++)
					{
						if (k == j)
						{
							System.out.printf("%c%d", '+', a[k]);
						}
						else
							System.out.printf("%2d", a[k]);
					}
					swap(a, j - 1, j);
					System.out.println();
				}
				else
				{
					for (int k = 0; k < a.length; k++)
					{
						if (k == j)
						{
							System.out.printf("%c%d", '-', a[k]);
						}
						else
							System.out.printf("%2d", a[k]);
					}
					System.out.println();
				}
			}
			System.out.println();
		}
	}
	
	void bubbleSort_Opt_Show(int[] a)
	{
		int k = 0;
		int out = 0;
		int swapN = 0;
		while (k < a.length - 1) //외부 루프
		{
			out++;
			System.out.println("패스" + out + ":");
			int last = a.length - 1;
			for (int j = a.length - 1; j >k; j--)  //내부 루프
			{
				if (a[j - 1] > a[j])
				{
					for (int x = 0; x < a.length; x++)
					{
						if (x == j)
						{
							System.out.printf("%c%d", '+', a[x]);
						}
						else
						{
							System.out.printf("%2d", a[x]);
						}
					}
					System.out.println();
					swap(a, j - 1, j);
					swapN++;
					last = j;
				}
				else
				{	
					for (int x = 0; x < a.length; x++)
					{
						if (x == j)
						{
							System.out.printf("%c%d", '-', a[x]);
						}
						else
							System.out.printf("%2d", a[x]);
					}
					System.out.println();
				}
			}
			k = last;
		}//while
		System.out.println("교환수: " + swapN);
		System.out.println("패스수: " + out);
	}
	
	void selectionSort_Show (int[] a)
	{
		
		int onw = 0;
		for (int i = 0; i < a.length - 1; i++)
		{
			int min = i;
			for (int j = i + 1; j < a.length; j++)
			{
				if(a[j] < a[min])
					min = j;
			}
			for (int t = 0; t < a.length; t++)
			{
				if (t == i)
				{
					System.out.printf("%2c", '*');
				}
				else if(t == min)
				{
					System.out.printf("%2c", '+');		
				}
				else
					System.out.print("  ");
			}
			System.out.println();
			for (int k = 0; k < a.length; k++)
			{
				System.out.printf("%2d", a[k]);
			}
			System.out.println();
			swap(a, i, min);
		}
		for (int k = 0; k < a.length; k++)
		{
			System.out.printf("%2d", a[k]);
		}
	}
	
	void quikSort_Show(int a[], int left, int right)
	{
		int pl = left;
		int pr = right;
		int x = a[(pl + pr) / 2];
		
		System.out.printf("a[%d]~a[%d] : {", left, right);
		for (int i = left; i < right; i++)
		{
			System.out.printf("%d, ", a[i]);
		}
		System.out.printf("%d}/n", a[right]);
		
		do
		{
			while (a[pl] < x) pl++;
			while (a[pr] > x) pr--;
			if (pl <= pr)
				swap(a, pl++, pr--);
		} while (pl <= pr);
		
		
		if (left < pr)
			quikSort_Show(a, left, pr);
		if (pl < right) 
			quikSort_Show(a, pl, right);
	}
	
}
