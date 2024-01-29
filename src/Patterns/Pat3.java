package Patterns;

public class Pat3 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int k = 5; k > i; k--) {
				System.out.print("-" + " ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("*" + " ");
			}
			for (int k = 5; k > i; k--) {
				System.out.print("-" + " ");
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) {
			for (int l = 0; l < i; l++) {
				System.out.print("-" + " ");
			}
			for (int m = 4; m > i; m--) {
				System.out.print("*" + " ");
			}
			for (int m = 4; m >= i; m--) {
				System.out.print("*" + " ");
			}
			for (int l = 0; l < i; l++) {
				System.out.print("-" + " ");
			}
			System.out.println();
		}

	}
}