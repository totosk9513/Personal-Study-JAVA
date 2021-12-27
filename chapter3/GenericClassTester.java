package chapter3;

public class GenericClassTester 
{
	static class GenericClass<T> //<>는 제네릭, parameter가 data type에 의존하지 않는다.
	{
		private T xyz; //가변 data type, T 어떠한 데이터형이 들어가도 상관없다.
		
		GenericClass(T t) //Constructor
						//data type에 의존하지 않다보니 리턴 type에 data type을 세팅 해 줄 필요가 없다
		{
			this.xyz = t;
		}
		T getXyz()	//return값이 가변 데이터형인 T가 리턴되니깐, T가 리턴되는 데이터형.
		{
			return xyz;
		}
	}
	
	public static void main(String[] args)
	{
		//이처럼 parameter에 String을 넣을수도 Integer를 넣을수도있다. 말 그대로 가변data type.
		GenericClass<String> s = new GenericClass<String>("ABC");
		//<>안에 데이터 타입을, ()에는 생성자에 들어갈 input 값.
		GenericClass<Integer> n = new GenericClass<Integer>(15);
		
		System.out.println(s.getXyz());
		System.out.println(n.getXyz());
		
		
	}
}
