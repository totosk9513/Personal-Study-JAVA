package chapter5;

public class recurTailCut 
{
	static void recurX(int n)
	{
		while(n > 0)
		{
			recurX(n - 1);
			System.out.println(n);
			n = n - 2;
		}
	}
	//얘는 재귀는 n개씩 새로 열면서 반복하는데, 자기 함수 내에서 iteration으로 대체하면서
	//브랜치를 열지 않는다. recur(n - 2)가 꼬리재귀였는데 이걸 일반 반복문으로 하면서 바꾸는것.
	
	static void recur(int n)
	{
		recur(n - 1);
		System.out.println(n);
		recur(n - 2);
	}
	
	//이거는 재귀를 2^n개씩 새로 또 열면서 반복, 트리처럼 계속 뻗어나가는 형식이며, 
	//이전 브랜치가 끝나야 상위 브랜치로 넘어갈 수 있네
}
