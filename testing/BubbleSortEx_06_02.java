package testing;
import java.util.Scanner;

class BubbleSortEx_06_02 {
	// ë°°ì—´???”ì†Œ a[idx1]ê³?a[idx2]ë¥?êµí™˜
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// ?¨ìˆœêµí™˜?•ë ¬
	static void bubbleSort(int[] a, int n) {
		int ccnt = 0; // ë¹„êµ?Ÿìˆ˜
		int scnt = 0; // êµí™˜?Ÿìˆ˜

		for (int i = 0; i < n - 1; i++) {
			System.out.printf("?¨ìŠ¤%dï¼?n", i + 1);
			for (int j = n - 1; j > i; j--) {
				for (int m = 0; m < n - 1; m++)
					System.out.printf("%3d %c", a[m], (m != j - 1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
				System.out.printf("%3d\n", a[n - 1]);

				ccnt++;
				if (a[j - 1] > a[j]) {
					scnt++;
					swap(a, j - 1, j);
				}
			}
			for (int m = 0; m < n; m++)
				System.out.printf("%3d  ", a[m]);
			System.out.println();
		}
		System.out.println("ë¹„êµë¥?" + ccnt + "???ˆìŠµ?ˆë‹¤.");
		System.out.println("êµí™˜ë¥?" + scnt + "???ˆìŠµ?ˆë‹¤.");
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("?¨ìˆœêµí™˜?•ë ¬  (ë²„ë¸”?•ë ¬)");
		System.out.print("?”ì†Ÿ?˜ï¼š");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]ï¼?");
			x[i] = stdIn.nextInt();
		}

		bubbleSort(x, nx); // ë°°ì—´ xë¥??¨ìˆœêµí™˜?•ë ¬
	}
}