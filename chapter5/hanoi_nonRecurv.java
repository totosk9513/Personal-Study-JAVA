package chapter5;
import java.util.Scanner;
import chapter4.IntStack;

public class hanoi_nonRecurv 
{
	static void move(int no, int x, int y) {
		int[] xstk = new int[100];
		int[] ystk = new int[100];
		int[] sstk = new int[100]; 
		int ptr = 0; // 
		int sw = 0;

		while (true) {
			if (sw == 0 && no > 1) {
				xstk[ptr] = x; 
				ystk[ptr] = y; 
				sstk[ptr] = sw; 
				ptr++;
				no = no - 1;
				y = 6 - x - y;
				continue;
			}

			System.out.printf("[%d]瑜?%d湲곕뫁?먯꽌 %d湲곕뫁?쇰줈 ???\n", no, x, y);

			if (sw == 1 && no > 1) {
				xstk[ptr] = x; // x??媛믪쓣 ?몄떆
				ystk[ptr] = y; // y??媛믪쓣 ?몄떆
				sstk[ptr] = sw; // sw??媛믪쓣 ?몄떆
				ptr++;
				no = no - 1;
				x = 6 - x - y;
				if (++sw == 2)
					sw = 0;
				continue;
			}
			do {
				if (ptr-- == 0) // ?ㅽ깮????鍮?
					return;
				x = xstk[ptr]; // 媛믪쓣 ??ν븯怨??덈뒗 x瑜???
				y = ystk[ptr]; // 媛믪쓣 ??ν븯怨??덈뒗 y瑜???
				sw = sstk[ptr] + 1; // 媛믪쓣 ??ν븯怨??덈뒗 sw瑜???
				no++;
			} while (sw == 2);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("?섎끂?댁쓽 ??");
		System.out.print("?먮컲??媛?닔竊?");
		int n = stdIn.nextInt();

		move(n, 1, 3); // 1湲곕뫁???볦씤 n 媛쒕? 3湲곕뫁?????
	}

	
}
