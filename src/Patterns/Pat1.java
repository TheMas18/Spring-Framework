package Patterns;

public class Pat1 {
	public static void main(String[] args) {

		/*
		 * 1) print solid rectangle ***** ***** ***** *****
		 */

//		int n = 4;
//		int m = 5;
//
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= m; j++) {
//
//				System.out.print("*");
//
//			}
//			System.out.println();
//		}

		/*
		 * 2) print hollow rectangle ***** *...* *...* *****
		 */
		// 11 12 13 14 15
		// 21 22 23 24 25
		// 31 32 33 34 35
		// 41 42 43 44 45

//		int n = 4;
//		int m = 5;
//
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= m; j++) {
//				if (i == 1 || i == n || j == 1 || j == m) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}

		/*
		 * 3) print half pyramid * ** *** ****
		 */
//
//		int n = 4;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		/*
		 * 4) print reverse half pyramid **** *** ** *
		 */
		// 00 01 02
		// 10 11 12
		// 20 21 22
//		int n = 3;
//		for (int i = n; i >= 1; i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		/*
		 * 5) print inverted half pyramid ---* --** -*** ****
		 */

		// 11 12 13 14
		// 21 22 23 24
		// 31 32 33 34
		// 41 42 43 44
//		int n = 4;
//		for (int i = 1; i <= n; i++) {
//			// for spaces
//			for (int j = 1; j <= n - i; j++) {
//				System.out.print("-");
//
//			}
//			// for stars
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//
//			}
//			 System.out.println();
//		}

		/*
		 * 6) 1 12 123 1234 12345
		 */

//		int n = 5;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}

		/*
		 * 7) 12345 1234 123 12 1
		 */

		// int n = 5;
		// for (int i = n; i >= 1; i--) {
		// for (int j = 1; j <= i; j++) {
		// System.out.print(j);
		// }
		// System.out.println();
		// }

		/*
		 * 8) floyd's triangle
		 * 
		 * 1 23 456 78910 1112131415
		 */

//		int n = 5;
//		int number = 1;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(number + " ");
//				number++;
//			}
//			System.out.println();
//		}

		/*
		 * 9) reverse floyd's triangle 1112131415 78910 456 23 1
		 */

//		int n = 5;
//		int number = 15;
//		for (int i = n; i >= 1; i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(number + " ");
//				number--;
//			}
//			System.out.println();
//		}

		/*
		 * 10) 0-1 triangle 1 01 101 0101 10101
		 */
		// 11 12 13 14
		// 21 22 23 24
		// 31 32 33 34
		// 41 42 43 44
//		int n = 5;
//		for (int i = 1; i <= n; i++) {
//
//			for (int j = 1; j <= i; j++) {
//				int sum = i + j;
//				if (sum % 2 == 0) {
//					System.out.print("1");
//				} else {
//					System.out.print("0");
//				}
//			}
//			System.out.println();
//		}
	}

}