package chapter2_2;
import java.util.Scanner;


public class introToClass //Oriented programming paradaim lel

{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		//PhysicalExamination.PhyscData gamja = new PhysicalExamination.PhyscData("감자", 1, 0.2);
		
	
		//PhyscData 클래스 type의 데이터가 들어가는 array x
		PhysicalExamination.PhyscData[] x = 
			{
					new PhysicalExamination.PhyscData("박현규", 162, 0.3),
					new PhysicalExamination.PhyscData("함진아", 173, 0.7),
					new PhysicalExamination.PhyscData("최윤미", 175, 2.0),
					new PhysicalExamination.PhyscData("홍연의", 171, 1.5),
					new PhysicalExamination.PhyscData("이수진", 168, 0.4),
					new PhysicalExamination.PhyscData("김영준", 174, 1.2),
					new PhysicalExamination.PhyscData("박용규", 169, 0.8),
			};
	
		
		int[] vdist = new int[PhysicalExamination.VMAX]; //vdist라는 int type를 넣는 array가
														 //vmax,그러니깐 총 21개의 숫자가 들어가는데
														 //그만큼 크기가 vdist에도 같히.
		
		System.out.println("ㅁ신체검사 리스트ㅁ");
		System.out.println("이름      키     시력");
		System.out.println("------------------");
		for (int i = 0; i < x.length; i ++)
		{
			System.out.printf("%-8s%3d%5.1f\n",  //아니 ㅅㅂ 머냐 
										x[i].name, x[i].height, x[i].vision);
		}
	
		System.out.printf("\n평균키 : %5.1fcm\n", PhysicalExamination.aveHeight(x));
		
		PhysicalExamination.distVision(x, vdist);
		
		System.out.println("\n시력 분포");
		for (int i = 0; i < PhysicalExamination.VMAX; i++)
			System.out.printf("%3.1f~:%2d명\n", i / 10.0, vdist[i]);
	}
	
	
}
