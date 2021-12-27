package chapter5;

import chapter4.IntStack;	//오오 신가하다 s.push라고 치니깐 다른 패키지에 있는 클래스를 임포트 할 수 잇게 하네


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
				continue; //continue를 실행하면 맨위로 다시 도돌이표.
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
