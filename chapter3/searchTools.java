package chapter3;

public class searchTools 
{
	static int seqSearch(int[] a, int n, int key) //리니서 서처 
	{
		int i = 0;
	
		while (true)
		{
			if (i == n)
				return -1;
			if (a[i] == key)
				return i;
			i++;
		}
	}
	
	static int linSearch(int[] arr, int key)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == key)
			{
				return i;
			}
		}
		System.out.println("The key does not exist in the array.");
		return -1;
	}
	
	static int seqSentiSearch(int[] a, int n, int key)  //센티넬 서처
	{
		int i = 0;
		
		a[n] = key;
		
		while(true)
		{
			if (a[i] == key)
				break;
			i++;
		}
		return i == n ? -1 : i;
	}
	
	
	static int binSearchA(int[] a, int n, int key)
	{
		int pl = 0;
		int pr = n - 1;
		
		do{
			int pc = (pl + pr)/2; //mid index
			if (a[pc] == key)
			{
				return pc; //만약에 mid index가 찾고있는 element이면 바로 return해서 싸이클 수를 줄임
			}
			else if (a[pc] < key)
			{
				pl = pc + 1;
			}
			else
			{
				pr = pc - 1;
			}
		} while(pl <= pr);
		return -1;
		
	}
	
	static int binSearchB(int[] a, int key)  //몇번째 인덱스인지 찾는것
	{
		int left = 0;
		int right = a.length - 1;
		
		
		while (left <= right)
		{
			int mid = left + ((right - left) / 2);  //원래는 그냥 (left + right) / 2 인
													//overflow때문에 저렇게 함
			if (key == a[mid])
			{
				return mid;
			}
			else if (a[mid] < key)
			{
				left = mid + 1;
			}
			else if (a[mid] > key)
			{
				right = mid - 1;
			}
		}
			return -1; //mandatory return문, 에러 제거
	}
}
