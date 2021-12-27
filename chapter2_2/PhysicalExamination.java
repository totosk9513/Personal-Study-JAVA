package chapter2_2;
import java.util.Scanner;

public class PhysicalExamination 
{
	static final int VMAX = 21;  //�̰� �ӳ� ���� (0.0���� 0.1������ 21����µ� ���� ���� INT�ݾ�)
	
	static class PhyscData
	{
		String name;
		int height;
		double vision;
	
	
		PhyscData(String name, int height, double vision) //������ constructor
														 //�� class�� �����ڴ� �� class �ȿ� �־����
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
				dist[(int)(dat[i].vision * 10)]++;  //�̴� �Ƴ� �� �Ҽ��� ��¥
			}
		
	}
	
}
