package chapter3;
import java.util.Arrays;

public class arrayUti 
{
	public static void main(String[] args)
	{
		int[] arr =	{1,3,5,7,9};
	
		int idx = Arrays.binarySearch(arr, 6);
		//arrays.binarySearch 가 검색에 실패 했을경우 -x -1을 반환함.
		//여기서 x는 index값이며 ex로 6은 7보다 크기 때문에 -4가 리턴
		//7의 index는 3이고 그러므로 -3 -1은 -4 
	
		System.out.println(idx);
		
		
	}
}
