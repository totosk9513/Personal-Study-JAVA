package chapter5;
import java.util.Scanner;	

public class factorial 
{
	static int factorial(int n)
	{
		if (n > 0)
			return n * factorial(n - 1); //�޼ҵ� �ȿ� �޼ҵ�, ���� �޼ҵ忡�� -1 �ϸ鼭 0�� ����
		else
			return 1; //�׷��� 0�Ǹ� ����
	}
	//����� �ڱ���� �ڱⰡ ���°Ŷ� ���� ���.
}
