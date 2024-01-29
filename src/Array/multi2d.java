package Array;

public class multi2d {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

		int c[][] = new int[3][3];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				// 1 2 3 //1 1 1
				// 2 2 2
				// 4 5 6 //3 3 3
				// 7 8 9
				for (int k = 0; k < c.length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}
}
