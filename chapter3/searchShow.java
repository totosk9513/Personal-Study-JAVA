package chapter3;
public class searchShow 
{
	void intlinearShow(int[]arr, int key)
	{
		
		System.out.print("   |  "); //1st line
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(i + "  ");
		}
		System.out.println();
		/////////////////////////
			
		System.out.print("---+---"); //2nd line
		for(int j = 0; j < arr.length; j++)
		{
			System.out.print("----");
		}
		System.out.println();
		////////////////////////
		
			//프린팅루프스테이션
			//n라인
		int index = 0;
		for(int k = 0; k <arr.length; k++)
		{
			System.out.print("   |  ");
			for(int n = 0; n <= k; n++)
			{
				if(n < k)
					System.out.print("  ");
				else
				System.out.print(" *");
			}
			System.out.println();
		////////////////////////
		//n+1라인
			System.out.print(" " + k + "|");
			for(int ind = 0; ind < arr.length; ind++)
			{
				System.out.print(" " + arr[ind]);
			}
			System.out.println();
			////////////////////////
			//n+2라인
			System.out.println("   |");
			if (intKeyCheck(arr, key, k) == true)
				break;
			else
				index++;
		}
		
		System.out.println(key + "는 x[" + index +"]에 있습니다.");
		
	}
	
	boolean intKeyCheck(int[]arr, int key, int index)
	{
		if (arr[index] == key)
			return true;
		else
			return false;
	}
	
	void intbinaryShow(int[]arr)
	{
		
	}
}
