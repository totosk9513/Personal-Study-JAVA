package Chapter2;

public class DS 
{
	public static void main(String[] args)
	{
		int[] a;
		
		a = new int[5]; //이때는 포인터! a는 int[]를 가지고 있는것이 아니고
						//그 배열을 포인팅을 한다.
		//대입
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		//a[4]는 일부러 initialize를 안했다
		
		
		System.out.println(a[0]);
		System.out.println(a[1]);		
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		//initialize가 안된 a[4] 0라는 값으로 자동 초기화 된다
		System.out.println(a);
		
		//a는 [I@1db9742 라는 주소를 가지고 있을뿐 그 배열을 가지고 있는것이 아니다
		
		int[] b = new int[4];
		
		b[0] = 10;
		b[1] = 11;
		b[2] = 12;
		b[3] = 13;
		
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		System.out.println(b);
		
		//b는 [I@106d69c
		
		//만약 b에 있는 배열을 a로 바꾼다면
		
		a = b; // a주소가 b 주소로 initialize된다.
				//그래서 a는
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		// 10 11 12 13 으로 출력이 나온다
		
		int[] kai = {9, 8, 7, 6, 5}; //배열 초기자(array initialize 에 의해 생성
		
		System.out.print(kai[0]);
		System.out.print(kai[1]);
		System.out.print(kai[2]);
		System.out.print(kai[3]);
		System.out.println(kai[4]);
		
		char[] t = new char[4];
		//자바는 유니코드를 사용한다
		
		t[0] = 'g';
		t[1] = '\u0101'; //?
		t[2] = 0x0041; //A 유니코드표
		t[3] = 0x0051; //Q 유니코드표
		
		System.out.println(t[0]);
		System.out.println(t[1]);
		System.out.println(t[2]);
		System.out.println(t[3]);
		
		//primitive types는 자바에서 null값을 넣을수 없다. (가비지밸류)
		//다만 char는 "unicode"의 null값(/u0000)은 넣을수 있다 (가비지밸류는 절대 아니다)
		
		

		
		
	}
}
