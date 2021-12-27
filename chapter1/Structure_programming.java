package chapter1;
import java.util.Scanner;

public class Structure_programming {

	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int no;
		
		System.out.println("2digit의 정수를 입력하세여.");
		
		do
		{
			System.out.print("input: ");
			no = stdIn.nextInt();
		} 
		while (no < 10 || no > 99);
		
		System.out.println("변수 no의 값은" + no + "가(이) 되었습니다.");
		
	}

}


