package Patterns;

public class Pat2 {
	public static void main(String[] args) {

		/*
		 * 1) Pattern print
		 * 
		 * ------* ----** --***
		 ********
		 ********
		 *** --*** ----** ------*
		 */
		// 11 12 13 14
		// 21 22 23 24
		// 31 32 33 34
		// 41 42 43 44

		/*
		 * int n = 4; for (int i = 1; i <= n; i++) {
		 * 
		 * // for star first part for (int j = 1; j <= i; j++) { System.out.print("*");
		 * } // for spaces
		 * 
		 * for (int j = 1; j <= 2 * (n - i); j++) {
		 * 
		 * System.out.print("-"); } // for star 2nd part for (int j = 1; j <= i; j++) {
		 * System.out.print("*");
		 * 
		 * } System.out.println(); } for (int i = n; i >= 1; i--) {
		 * 
		 * // for star first part for (int j = 1; j <= i; j++) { System.out.print("*");
		 * } // for spaces for (int j = 1; j <= 2 * (n - i); j++) {
		 * 
		 * System.out.print("-"); } // for star 2nd part for (int j = 1; j <= i; j++) {
		 * System.out.print("*");
		 * 
		 * } System.out.println(); }
		 */
		// 2)

//		int n = 5;
//		for (int i = 1; i <= n; i++) {
//			// // for spaces
//			for (int j = 1; j <= n - i; j++) {
//				System.out.print("-");
//
//			}
//			// // stars
//			for (int j = 1; j <= 5; j++) {
//				System.out.print("*");
//
//			}
//
//			for (int j = 2; j <= i; j++) {
//				System.out.print("-");
//
//			}
//			System.out.println();
//		}

		// 3)

		// int n = 5;
		// for (int i = 1; i <= n; i++) {

		// for (int j = 1; j <= n - i; j++) {
		// System.out.print("-");
		// }
		// for (int j = 1; j <= i; j++) {
		// System.out.print(i + "-");
		// }
		// System.out.println();
		// }

        int n = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("-");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {

		 System.out.print("*");
		 }
		 System.out.println("");
		 }

		 for (int i = 1; i <= 4; i++) {
		 for (int j = 1; j <= i; j++) {

		 System.out.print("*");
		 }
		 System.out.println("");
		 }

		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {

				System.out.print("-");
			}
			for (int k = 1; k <= i; k++) {

				System.out.print("*");
			}
			System.out.println("");
		}

		for (int i = 1; i <= 4; i++) {
			for (int j = 2; j <= i; j++) {
				System.out.print("-" + " ");
			}
			for (int k = 4; k >= i; k--) {
				System.out.print("*" + " ");
			}

			System.out.println();

		}

		for (int i = 1; i <= 5; i++) {

			for (int j = 4; j >= i; j--) {
				System.out.print("-" + " ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();

		}

		for (int i = 1; i <= 4; i++) {
			for (int l = 1; l <= i; l++) {
				System.out.print("-" + " ");
			}
			for (int m = 4; m >= i; m--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}
