package chapter4;
import java.util.Scanner;

public class IntQTester 
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		ringQ s = new ringQ(64); //ringQ Ŭ���� �ν����� ��
		
		while (true) //�̰� ���� ���� ������ִ°� ����. �Ƹ� C �������� �Ҹ� var ���� �Ȱǵ��߰���.
		{
			System.out.println("���� ����Ÿ �� : " +s.size() + " / "
											+ s.capacity());
			
			System.out.print("(1)��ť  (2)��ť  (3)��ũ  " + "(4)����  (0)���� : ");
			
			
			int menu = stdIn.nextInt();
			if (menu == 0) break;
		
			int x;
			switch (menu) //switch���� int�� �ް� case (x)�� ���� �۵��ϴ°� ����
						//���� ������ ���� �۵��� �ѵ� break;�� ���ϸ� �� ������ �ִ� ���鵵 ���������� �۵�
						//���� while�� �ȿ� �����Ƿν� switch���� ��� �ݺ���ų�� �ֵ��� �۵�. 
						//��� 0�� ������ while���� break;�Ǿ �������� ����.
			{
			case 1:  	//��ť
				System.out.print("������ : ");
				x = stdIn.nextInt();
				try
				{
					s.enque(x);
				}
				catch (ringQ.OverflowIntQueueException e)
				{
					System.out.println("ť�� ���� ã���ϴ�.");
				}
				//try,catch ���� ����ó���� �Ҷ� ����� �Ѵ�. 
				//���� catch�� ���� �ɸ� Ŭ������ throw�޴´ٸ� catch���� ���� ������ ó��
				//�ƴϴٸ� ���������� try���� �ִ°ɷ� ó��.
				//�̷��� �ϸ� s.enque�� int���̶� ������ int�� �����ؾ��ϴµ� throw�� ���ؼ�
				//int������ ���� ���ϸ鼭 ����ó���� �� �� �ִ�. 
				//������ ����ó���� �ҋ� -1 �� �����ϴ� �� throw-try-catch������
				//-1�� ���� ���ϰ� ����ó���ϴ°Ŷ� ����.
				break;
			
			
			case 2:		//��ť
				try 
				{
					x = s.deque();
					System.out.println("��ť�� �����ʹ� " + x + "�Դϴ�.");
				}
				catch (ringQ.EmptyIntQueueException e)
				{
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;
				
			case 3:  	//��ũ
				try
				{
					x = s.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
				}
				catch (ringQ.EmptyIntQueueException e)
				{
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;
				
			case 4:
				s.dump();
				break;
			}//switch
		}//while
	}//main
}//class
