package chapter3;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;


public class PhysExamSearch 
{

	static class PhyscData
	{
		private String name;
		private int height;
		private double vision;
	
		public PhyscData(String name, int height, double vision)
		{
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	
		public String toString() //자동으로 호출되는데 왜 자동으로?
		{
			return "[" + name + "] [" + height + "] [" + vision + "]";
		}
	
		public static final Comparator<PhyscData> HEIGHT_ORDER 
		= new HeightOrderComparator();
		//HEIGHT_ORDER가 객체명, HeightOrderComparator가 인스턴스 콜이 된 클래스
		
		private static class HeightOrderComparator implements Comparator<PhyscData>
		{
			public int compare(PhyscData d1, PhyscData d2)
			{
				return	(d1.height > d2.height) ?	 1 :	//d1.height가 크면 1리턴 
					 	(d1.height < d2.height) ?	-1 : 0;	//d2.height가 크면 -1리턴, 
															//위 둘다 조건 성립이 안되면 0리턴.
			}
		}//얘가 정렬을 해주는거 같다. BinarySearch는 정렬이 된 상태에서 검색이 가능하기때매
		//근데 그렇다고 저 아래에 있는 PhyscData type의 x 배열 자체를 정렬하는건 아닌거 같다, 
		//저기있는 HEIGHT ORDER 객체 안에서만 작동 하는듯?
	}//PhyscData 클래스 끝
	
	
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		PhyscData[] x =
			{
				new PhyscData("김한결", 169, 0.8),
				new PhyscData("홍준기", 171, 1.5),
				new PhyscData("전서현", 173, 0.7),
				new PhyscData("이나령", 162, 0.3),
				new PhyscData("이호연", 174, 1.2),
				new PhyscData("유자훈", 168, 0.4),
				new PhyscData("이수민", 175, 2.0),
					//정렬이 안되여 있다
			};
		
		System.out.print("몇 cm인 사람을 찾고 있나요?: ");
		int height = stdIn.nextInt();
		int idx = Arrays.binarySearch //comparator를 사용하는 binarySearch.
				(
						x, //배열x에서
						new PhyscData("", height, 0.0), //height
														//(height혼자만 변수라서 height만 적용댐)
						PhyscData.HEIGHT_ORDER
				);
		
		if (idx < 0)
		{
			System.out.println("요소가 없습니다.");
		}
		else
		{
			System.out.println("x[" + idx + "]에 있습니다");
			System.out.println("찾은 데이터: " + x[idx]);
		}
		
		for (int i = 0; i < x.length; i++)
		System.out.println(x[i]);


	}

}
