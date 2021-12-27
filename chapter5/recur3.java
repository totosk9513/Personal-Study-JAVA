package chapter5;
import java.util.Scanner;

import chapter4.IntStack;	

public class recur3 
{
	static void recurv3(int n)
	{
		if (n > 0)
		{
			recurv3(n - 1);
			//System.out.println("[recurv3("+ n + " - 1)]");
			recurv3(n - 2);
			//System.out.println("[recurv3("+ n + " - 2)]");
			System.out.println(n);
		}
	}//recursive call
	
	
	static void nrecur3(int n) {
		int[] nstk = new int[100];
		int[] sstk = new int[100];
		int ptr = -1;
		int sw = 0;

		while (true) {
			if (n > 0) {
				ptr++;
				nstk[ptr] = n;
				sstk[ptr] = sw;

				if (sw == 0)
					n = n - 1;
				else if (sw == 1) {
					n = n - 2;
					sw = 0;
				}
				continue;
			}
			do {
				n = nstk[ptr];
				sw = sstk[ptr--] + 1;

				if (sw == 2) {
					System.out.println(n);
					if (ptr < 0)
						return;
				}
			} while (sw == 2);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수를 입력하세영: ");
		int x = stdIn.nextInt();

		nrecur3(x);
	}
}
