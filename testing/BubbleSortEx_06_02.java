package testing;
import java.util.Scanner;

class BubbleSortEx_06_02 {
	// λ°°μ΄???μ a[idx1]κ³?a[idx2]λ₯?κ΅ν
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// ?¨μκ΅ν?λ ¬
	static void bubbleSort(int[] a, int n) {
		int ccnt = 0; // λΉκ΅?μ
		int scnt = 0; // κ΅ν?μ

		for (int i = 0; i < n - 1; i++) {
			System.out.printf("?¨μ€%dοΌ?n", i + 1);
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
		System.out.println("λΉκ΅λ₯?" + ccnt + "???μ΅?λ€.");
		System.out.println("κ΅νλ₯?" + scnt + "???μ΅?λ€.");
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("?¨μκ΅ν?λ ¬  (λ²λΈ?λ ¬)");
		System.out.print("?μ?οΌ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]οΌ?");
			x[i] = stdIn.nextInt();
		}

		bubbleSort(x, nx); // λ°°μ΄ xλ₯??¨μκ΅ν?λ ¬
	}
}