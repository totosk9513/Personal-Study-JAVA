package chapter3;
import java.util.Scanner;
public class ID 

// instance method 	������ �޼ҵ�, static���� �޸𸮰��� �̸� ������ �� ���� �ʾƼ� instance call�� �ؾ� ���� �ü� �ִ�
// Class method	 	���� �޼ҵ�,	�̹� static���� ���� �޸𸮰��� ������ ���¶� instance call�� �� �ʿ䰡 ����.
{
	Scanner stdIn = new Scanner(System.in);
	private static int counter = 0; //���̵带 �� �� �ο��ߴ��� ����,
									// static�̶� ��ü�� ����, ���� �������� �ʴ´� <-������ �ǹ̳�! ���״�� static
	private String id;	//���̵�
	private String psd; //�н�����
	
	public ID() //constructor ������
	{
		System.out.print("Input ID: ");
		id = new String(stdIn.next());
		System.out.print("Input Password: ");
		psd = new String(stdIn.next());
		++counter; //�ް������ϴ�. int counter�� static���� ���� �߱⶧���� ��ü�ȿ� �������� �ʰ�
				 	//�̹� �޸𸮰��� ������ �� counter ������ ����ȴ�. �ƾ� ������ �����߳�
					//����� ���� static�� ���� �ƿ� ���ظ� ���߾��Ŵ�.
	}
	
	//constructor���� �޼ҵ带 ���� ���� �� ���� ����?
	//constructor ���� �޼ҵ带 ���Ͽ� �������� initialize�� �ҷ��� �� �޼ҵ带 ������ �ܿ��� �ϴ� ������ �ְ�
	//�׷��� ������ ������ �� ���� �ִ�.
	
	
	public String getId()//�ν��Ͻ� �޼ҵ�,static�� �Ⱥ����� ������ ����ҷ��� ������ �ν��Ͻ� ���� �ؾ� �޸𸮸� �ҷ��ü��մ�
	{
		return id;
	}
	
	public String getPassword()
	{
		return psd;
	}
	
	public static int getCounter()//Ŭ���� �޼ҵ�, static�� ������ ������ �̹� �޸𸮰� ������ ����. 
	{										//�ν��Ͻ� ���� ���ص� ����
		return counter;
	}
}
																							

	
