package Chapter2;

public class DS 
{
	public static void main(String[] args)
	{
		int[] a;
		
		a = new int[5]; //�̶��� ������! a�� int[]�� ������ �ִ°��� �ƴϰ�
						//�� �迭�� �������� �Ѵ�.
		//����
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		//a[4]�� �Ϻη� initialize�� ���ߴ�
		
		
		System.out.println(a[0]);
		System.out.println(a[1]);		
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		//initialize�� �ȵ� a[4] 0��� ������ �ڵ� �ʱ�ȭ �ȴ�
		System.out.println(a);
		
		//a�� [I@1db9742 ��� �ּҸ� ������ ������ �� �迭�� ������ �ִ°��� �ƴϴ�
		
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
		
		//b�� [I@106d69c
		
		//���� b�� �ִ� �迭�� a�� �ٲ۴ٸ�
		
		a = b; // a�ּҰ� b �ּҷ� initialize�ȴ�.
				//�׷��� a��
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		// 10 11 12 13 ���� ����� ���´�
		
		int[] kai = {9, 8, 7, 6, 5}; //�迭 �ʱ���(array initialize �� ���� ����
		
		System.out.print(kai[0]);
		System.out.print(kai[1]);
		System.out.print(kai[2]);
		System.out.print(kai[3]);
		System.out.println(kai[4]);
		
		char[] t = new char[4];
		//�ڹٴ� �����ڵ带 ����Ѵ�
		
		t[0] = 'g';
		t[1] = '\u0101'; //?
		t[2] = 0x0041; //A �����ڵ�ǥ
		t[3] = 0x0051; //Q �����ڵ�ǥ
		
		System.out.println(t[0]);
		System.out.println(t[1]);
		System.out.println(t[2]);
		System.out.println(t[3]);
		
		//primitive types�� �ڹٿ��� null���� ������ ����. (���������)
		//�ٸ� char�� "unicode"�� null��(/u0000)�� ������ �ִ� (����������� ���� �ƴϴ�)
		
		

		
		
	}
}
