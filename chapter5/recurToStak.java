package chapter5;

import chapter4.IntStack;	//���� �Ű��ϴ� s.push��� ġ�ϱ� �ٸ� ��Ű���� �ִ� Ŭ������ ����Ʈ �� �� �հ� �ϳ�


public class recurToStak 
{
	static void recur(int n)
	{
		IntStack s = new IntStack(n);
		
		while(true)
		{
			if (n > 0)
			{
				s.push(n);
				n = n - 1;
				continue; //continue�� �����ϸ� ������ �ٽ� ������ǥ.
			} 
			
			if (s.isEmpty() != true)
			{
			n = s.pop();
			System.out.println(n);
			n = n - 2;
			continue;
			}
			break;
		}
	
	}

}
