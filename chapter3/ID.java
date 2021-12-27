package chapter3;
import java.util.Scanner;
public class ID 

// instance method 	비정적 메소드, static으로 메모리값을 미리 참조를 해 두지 않아서 instance call을 해야 땡겨 올수 있다
// Class method	 	정적 메소드,	이미 static으로 인해 메모리값이 땡겨진 상태라서 instance call을 할 필요가 없다.
{
	Scanner stdIn = new Scanner(System.in);
	private static int counter = 0; //아이드를 몇 개 부여했는지 저장,
									// static이라서 객체에 따라, 따로 움직이지 않는다 <-정적에 의미네! 말그대로 static
	private String id;	//아이디
	private String psd; //패스워드
	
	public ID() //constructor 생성자
	{
		System.out.print("Input ID: ");
		id = new String(stdIn.next());
		System.out.print("Input Password: ");
		psd = new String(stdIn.next());
		++counter; //햇갈릴만하다. int counter는 static으로 선언 했기때문에 객체안에 존재하지 않고
				 	//이미 메모리값을 참조가 된 counter 변수에 저장된다. 아씨 운좋게 이해했네
					//기분이 좋다 static이 먼지 아예 이해를 못했었거던.
	}
	
	//constructor말고 메소드를 쓰면 되지 왜 굳이 쓰냐?
	//constructor 없이 메소드를 통하여 변수들을 initialize를 할러면 그 메소드를 일일이 외워야 하는 단점이 있고
	//그래서 오히려 에러가 날 수도 있다.
	
	
	public String getId()//인스턴스 메소드,static을 안붙혔기 때문에 사용할러면 무조건 인스턴스 콜을 해야 메모리를 불러올수잇다
	{
		return id;
	}
	
	public String getPassword()
	{
		return psd;
	}
	
	public static int getCounter()//클래스 메소드, static을 붙혔기 때문에 이미 메모리가 참조된 상태. 
	{										//인스턴스 콜을 안해도 가능
		return counter;
	}
}
																							

	
