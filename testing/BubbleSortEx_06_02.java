package testing;
import java.util.Scanner;

class BubbleSortEx_06_02 {
	// 배열???�소 a[idx1]�?a[idx2]�?교환
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// ?�순교환?�렬
	static void bubbleSort(int[] a, int n) {
		int ccnt = 0; // 비교?�수
		int scnt = 0; // 교환?�수

		for (int i = 0; i < n - 1; i++) {
			System.out.printf("?�스%d�?n", i + 1);
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
		System.out.println("비교�?" + ccnt + "???�습?�다.");
		System.out.println("교환�?" + scnt + "???�습?�다.");
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("?�순교환?�렬  (버블?�렬)");
		System.out.print("?�솟?�：");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]�?");
			x[i] = stdIn.nextInt();
		}

		bubbleSort(x, nx); // 배열 x�??�순교환?�렬
	}
}