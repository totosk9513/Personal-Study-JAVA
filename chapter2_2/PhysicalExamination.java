package chapter2_2;
import java.util.Scanner;

public class PhysicalExamination 
{
	static final int VMAX = 21;  //이게 머냐 ㅅㅂ (0.0부터 0.1단위로 21개라는데 무슨 ㅅㅂ INT잖아)
	
	static class PhyscData
	{
		String name;
		int height;
		double vision;
	
	
		PhyscData(String name, int height, double vision) //생성자 constructor
														 //한 class의 생성자는 그 class 안에 있어야함
		{
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	static double aveHeight(PhyscData[] dat)
	{
		double sum = 0;
		
		for (int i = 0; i < dat.length; i++)
		{
			sum += dat[i].height;
			
		}
		return sum / dat.length;
	}
	
	static void distVision(PhyscData[] dat, int[] dist)
	{
		int i = 0;
		dist[i] = 0;
		
		for (i = 0; i < dat.length; i++)
			if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
			{
				dist[(int)(dat[i].vision * 10)]++;  //됫다 아놔 좀 소수점 진짜
			}
		
	}
	
}
