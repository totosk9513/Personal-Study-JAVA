package chapter4;
import java.util.Scanner;	

public class LastNElement 
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		final int N = 10;
		int[] a = new int[N]; //입력받은 값 저장
		int cnt = 0; //입력 받은 개수
		int retry; 	//리트라이?
		
		System.out.println("정수를 입력하세영.");
		
		do
		{
			System.out.printf("%d번째 정수 :", cnt + 1);
			a[cnt++ % N] = stdIn.nextInt();  //이게 혹시 링 버퍼???? 그런거 같은데 
			//맞네 버퍼의 최대 크기 만큼 나눠서 나머지부터 다시 재초기화 시키는 링버퍼.
		
			System.out.print("계속 할까요? (예.1/아녀.0) : ");
			retry = stdIn.nextInt();
		}
		while (retry == 1);
		
		int i = cnt - N;
		if (i < 0) 
			i = 0;
		//만약 i 가 0이상이란건 버퍼의 범위인 10을 넘어서 다시 초기화된 섹터가 있어서
		//제일 마지막으로 재초기화된 수 부터 cnt수 까지 세어야 한다.
		//0 이하일 경우는 아직 버퍼의 범위인 10을 안넘겨기 때문에 그냥 0부터 cnt까지 덤핑해도 무관.
		for ( ; i < cnt; i++)
			System.out.printf("%2d번째의 정수 = %d\n" , i + 1, a[i % N]	);
	
	}
}
