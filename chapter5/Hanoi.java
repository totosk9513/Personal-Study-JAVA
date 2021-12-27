package chapter5;
import java.util.Scanner;

public class Hanoi 
{
	//no개의 원반을 from x기둥 to y기둥
	static void move(int no, int x, int y) 
	{
		if (no > 1)
			move(no - 1, x , 6 - x - y);
		
		System.out.println("원반[" + no + "]을" + x + "기둥에서 " + y + "기둥으로 옯김");
		
		if (no > 1)
			move(no - 1, 6 - x - y, y);
	}
	
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("하노이의 탑");
		System.out.print("원반 개수 :");
		int n = stdIn.nextInt();
		
		move(n,1,3);
		
	}
	
	//하노이탑 매커니즘가 어캐 되는지 출력하면서 보여주는 클래스이며, 실제로는 하노이의 탑이 없네.
}
