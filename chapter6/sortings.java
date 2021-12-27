package chapter6;

public class sortings
{
	
	static void swap(int[] a, int idx1, int idx2)
	{
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
		
	void bubbleSort(int[] a)
	{
		for(int i = 0; i < a.length - 1; i++)
		{
			for(int j = a.length - 1; j > i; j--)
			{
				if (a[j - 1] > a[j])
					swap(a,j - 1, j);
			}
				
		}	
	}
	
	void bubbleSort_rev(int[] a)
	{
		for (int i = a.length - 1; i > 0; i--)
		{
			for (int j = 0; j < i; j++)
			{
				if (a[j] > a[j + 1])
					swap(a, j + 1, j);
			}
		}
	}
	
	void bubbleSort_Optd1(int[] a)
	{
		for (int i = 0; i < a.length - 1; i++)
		{
			int xchg = 0 ;
			for (int j = a.length - 1; j > i; j--)
			{
				if (a[j - 1] > a[j])
					swap(a,j - 1, j);
				xchg++;
			}
			if (xchg == 0)
				break;
		}
	}
	
	void bubbleSort_Optd2(int[] a)
	{
		int k = 0;
		while (k < a.length - 1)
		{
			int last = a.length -1;
			for (int j = a.length - 1; j > 1; j--)
			{
				if (a[j - 1] > a[j])
				{
					swap(a,j - 1,j);
					last = j;
				}
				k = last;
			}
		}
	}
	
	void shakerSort (int[] a)
	{
		int l = 0;
		int r = a.length - 1;
		while (l < r)
		{
			for (int i = r; i > l; i--)
			{
				if (a[i - 1] > a[i])
					swap(a,i - 1, i);
			}
			l++;
			
			for (int j = l; j < r; j++)
				
			{
				if (a[j] > a[j + 1])
					swap(a, j + 1, j);
			}
			r--;
		}
		
	}
	
	void selectionSort(int[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			int min = i;
			for (int j = i + 1; j < a.length; j++)
			{
				if (a[j] < a[min])
				{
					min = j;
				}
			}
			swap(a, i, min);		}
	}
	
	void insertionSort(int[] a)
	{
		for (int i = 1; i < a.length; i ++)
		{
			int tmp = a[i];
			int j;  //자바라서 local var 범위 때매.. 안쪽 for말고 바깥쪽 for문에서 variable 선언 해야
			for (j = i; j > 0 && a[j - 1] > tmp; j--)
			{
				a[j] = a[j - 1]; //비교되고있는 a[i]를 계속 이전거랑 비교하고, a[i]가 작으면 교체,
								//크다면 내부 for문 종료
			}
			a[j] = tmp;//여기서 그 local var을 써먹거던.
		}
	}
	
	void insertionSort_Opt1(int[] a) //머지?
	{
		for (int i = 2; i < a.length; i++)
		{
			int tmp = a[0] = a[i];
			int j = i;
			for(; a[j - 1] > tmp; j--)
			{
				a[j] = a[j - 1];
			}
			if(j > 0)
				a[j] = tmp;
		}
	}
	
	void binaryInsertionSort(int[] a)
	{
		
	}
	
	void shellSort_org(int[] a)
	{
		for(int h = a.length / 2; h > 0; h /= 2)
		{
			for(int i = h; i < a.length; i++)
			{
				int tmp = a[i];
				int j;
				for(j = i - h; j >= 0 && a[j] > tmp; j -= h)
				{
					a[j + h] = a[j];
				}
				a[j + h] = tmp;
			}
		}
	}
	
	void shelloSort_opt1(int[] a) //책에서 적힌대로, h * 3 + 1 방식
	{
		int h;
		for (h = 1; h < a.length / 9; h = h * 3+1); //h의 초기값 정하기
		
		for (; h > 0; h /= 3)
		{
			for (int i = h; i < a.length; i++)
			{
				int j;
				int tmp = a[i];
				for (j = i - h; j >= 0 && a[j] > tmp; j -= h)
				{
					a[j + h] = a[j];
				}
				a[j + h] = tmp;
			}
		}
	}
	
	static void quikSort(int[] a, int left, int right) //quiksort in the book
	{
		
		int pl = left; 	// = 0;
		int pr = right;	// a.length - 1;
		int x = a[(pl + pr) / 2];	// a[a.length / 2];
		
		do  //partition part
		{
			while (a[pl] < x) 
				pl++;
			while (a[pr] > x)
				pr++;
			if (pl <= pr) //if, pl <= pr로 에러 필터링 가능.
			{
				swap(a, pl++, pr--);
			}	
		}while (pl <= pr); //pl,pr이 반대쪽으로 넘어가면 끝.(recursive로 계속 반복은 되고 있음)
	
		
		//recursion part
		if (left < pr) 
			quikSort(a, left, pr); //피봇 아랫부분 recursion
		if (pl < right)
			quikSort(a, pl, right); //피봇 윗부분 recursion
		
	}
	
	
	static void quikSort(int[] a) //간접 recursion, 조금 어이가 없네 ...
	{
		quikSort(a, 0, a.length - 1);
	}
	
	
		


}
