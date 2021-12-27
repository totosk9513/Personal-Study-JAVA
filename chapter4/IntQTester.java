package chapter4;
import java.util.Scanner;

public class IntQTester 
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		ringQ s = new ringQ(64); //ringQ 클래스 인스던스 콜
		
		while (true) //이게 무한 루프 만들어주는거 같다. 아마 C 같았으면 불린 var 만들어서 안건들어야겠지.
		{
			System.out.println("현재 데이타 수 : " +s.size() + " / "
											+ s.capacity());
			
			System.out.print("(1)인큐  (2)디큐  (3)피크  " + "(4)덤프  (0)종료 : ");
			
			
			int menu = stdIn.nextInt();
			if (menu == 0) break;
		
			int x;
			switch (menu) //switch문에 int를 받고 case (x)에 따라서 작동하는거 같다
						//받은 정수에 따라 작동을 한뒤 break;를 안하면 그 다음에 있는 문들도 순차적으로 작동
						//또한 while문 안에 넣으므로써 switch문을 계속 반복시킬수 있도록 작동. 
						//대신 0를 넣으면 while문이 break;되어서 루프문이 끝남.
			{
			case 1:  	//인큐
				System.out.print("데이터 : ");
				x = stdIn.nextInt();
				try
				{
					s.enque(x);
				}
				catch (ringQ.OverflowIntQueueException e)
				{
					System.out.println("큐가 가득 찾습니다.");
				}
				//try,catch 문은 예외처리를 할때 사용을 한다. 
				//만약 catch에 조건 걸린 클래스가 throw받는다면 catch문에 적힌 오더로 처리
				//아니다면 정상적으로 try문에 있는걸로 처리.
				//이렇게 하면 s.enque가 int형이라서 무조건 int로 리턴해야하는데 throw를 통해서
				//int형으로 리턴 안하면서 예외처리를 할 수 있다. 
				//예전에 예외처리를 할떄 -1 로 리턴하는 걸 throw-try-catch문으로
				//-1로 리턴 안하고 예외처리하는거랑 같다.
				break;
			
			
			case 2:		//디큐
				try 
				{
					x = s.deque();
					System.out.println("디큐한 데이터는 " + x + "입니다.");
				}
				catch (ringQ.EmptyIntQueueException e)
				{
					System.out.println("큐가 비어 있습니다.");
				}
				break;
				
			case 3:  	//피크
				try
				{
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				}
				catch (ringQ.EmptyIntQueueException e)
				{
					System.out.println("큐가 비어 있습니다.");
				}
				break;
				
			case 4:
				s.dump();
				break;
			}//switch
		}//while
	}//main
}//class
