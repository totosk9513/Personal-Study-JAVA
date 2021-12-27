package Chapter2;

public class primenumber 
{
	public static void main(String[] args)
	{
		int count = 0;
		
		for (int n = 2; n <= 1000; n++)  // 2에서 1000까지....
		{
			int i;
			for (i = 2; i <n; i++) //그 수가 소수인지 아닌지 확인, 2~그 수 까지 나머지가 나오는지 체크
			{
				count++;
				if(n % i == 0)
					break;
			}
			if (n == i)
				System.out.println(n);
		}
		
		System.out.println("나눗셈을 수행한 횟수: " + count);
	}
}
