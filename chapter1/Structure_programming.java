package chapter1;
import java.util.Scanner;

public class Structure_programming {

	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int no;
		
		System.out.println("2digit�� ������ �Է��ϼ���.");
		
		do
		{
			System.out.print("input: ");
			no = stdIn.nextInt();
		} 
		while (no < 10 || no > 99);
		
		System.out.println("���� no�� ����" + no + "��(��) �Ǿ����ϴ�.");
		
	}

}


