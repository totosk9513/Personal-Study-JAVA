package chapter2_2;
import java.util.Scanner;


public class introToClass //Oriented programming paradaim lel

{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		//PhysicalExamination.PhyscData gamja = new PhysicalExamination.PhyscData("����", 1, 0.2);
		
	
		//PhyscData Ŭ���� type�� �����Ͱ� ���� array x
		PhysicalExamination.PhyscData[] x = 
			{
					new PhysicalExamination.PhyscData("������", 162, 0.3),
					new PhysicalExamination.PhyscData("������", 173, 0.7),
					new PhysicalExamination.PhyscData("������", 175, 2.0),
					new PhysicalExamination.PhyscData("ȫ����", 171, 1.5),
					new PhysicalExamination.PhyscData("�̼���", 168, 0.4),
					new PhysicalExamination.PhyscData("�迵��", 174, 1.2),
					new PhysicalExamination.PhyscData("�ڿ��", 169, 0.8),
			};
	
		
		int[] vdist = new int[PhysicalExamination.VMAX]; //vdist��� int type�� �ִ� array��
														 //vmax,�׷��ϱ� �� 21���� ���ڰ� ���µ�
														 //�׸�ŭ ũ�Ⱑ vdist���� ����.
		
		System.out.println("����ü�˻� ����Ʈ��");
		System.out.println("�̸�      Ű     �÷�");
		System.out.println("------------------");
		for (int i = 0; i < x.length; i ++)
		{
			System.out.printf("%-8s%3d%5.1f\n",  //�ƴ� ���� �ӳ� 
										x[i].name, x[i].height, x[i].vision);
		}
	
		System.out.printf("\n���Ű : %5.1fcm\n", PhysicalExamination.aveHeight(x));
		
		PhysicalExamination.distVision(x, vdist);
		
		System.out.println("\n�÷� ����");
		for (int i = 0; i < PhysicalExamination.VMAX; i++)
			System.out.printf("%3.1f~:%2d��\n", i / 10.0, vdist[i]);
	}
	
	
}
