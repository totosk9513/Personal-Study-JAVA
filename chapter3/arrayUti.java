package chapter3;
import java.util.Arrays;

public class arrayUti 
{
	public static void main(String[] args)
	{
		int[] arr =	{1,3,5,7,9};
	
		int idx = Arrays.binarySearch(arr, 6);
		//arrays.binarySearch �� �˻��� ���� ������� -x -1�� ��ȯ��.
		//���⼭ x�� index���̸� ex�� 6�� 7���� ũ�� ������ -4�� ����
		//7�� index�� 3�̰� �׷��Ƿ� -3 -1�� -4 
	
		System.out.println(idx);
		
		
	}
}
