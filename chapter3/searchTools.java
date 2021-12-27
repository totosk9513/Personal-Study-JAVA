package chapter3;

public class searchTools 
{
	static int seqSearch(int[] a, int n, int key) //���ϼ� ��ó 
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
	
	static int seqSentiSearch(int[] a, int n, int key)  //��Ƽ�� ��ó
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
				return pc; //���࿡ mid index�� ã���ִ� element�̸� �ٷ� return�ؼ� ����Ŭ ���� ����
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
	
	static int binSearchB(int[] a, int key)  //���° �ε������� ã�°�
	{
		int left = 0;
		int right = a.length - 1;
		
		
		while (left <= right)
		{
			int mid = left + ((right - left) / 2);  //������ �׳� (left + right) / 2 ��
													//overflow������ ������ ��
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
			return -1; //mandatory return��, ���� ����
	}
}
