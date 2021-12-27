package chapter3;

public class GenericClassTester 
{
	static class GenericClass<T> //<>�� ���׸�, parameter�� data type�� �������� �ʴ´�.
	{
		private T xyz; //���� data type, T ��� ���������� ���� �������.
		
		GenericClass(T t) //Constructor
						//data type�� �������� �ʴٺ��� ���� type�� data type�� ���� �� �� �ʿ䰡 ����
		{
			this.xyz = t;
		}
		T getXyz()	//return���� ���� ���������� T�� ���ϵǴϱ�, T�� ���ϵǴ� ��������.
		{
			return xyz;
		}
	}
	
	public static void main(String[] args)
	{
		//��ó�� parameter�� String�� �������� Integer�� ���������ִ�. �� �״�� ����data type.
		GenericClass<String> s = new GenericClass<String>("ABC");
		//<>�ȿ� ������ Ÿ����, ()���� �����ڿ� �� input ��.
		GenericClass<Integer> n = new GenericClass<Integer>(15);
		
		System.out.println(s.getXyz());
		System.out.println(n.getXyz());
		
		
	}
}
