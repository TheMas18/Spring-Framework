package Patterns;

import java.util.Iterator;

public class LearnPatterns {
	// 11 12 13 14 15
	// 21 22 23 24 25
	// 31 32 33 34 35
	// 41 42 43 44 45
	// 51 52 53 54 55

	public static void main(String[] args) {
//		int n = 4;
//		for (int i = 1; i <= n; i++) {
//
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			int spaces = 2 * (n - i);
//			for (int k = 1; k <= spaces; k++) {
//				System.out.print(" ");
//			}
//
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		for (int i = 1; i <= n; i++) {
//
//			for (int j = n; j >=i; j--) {
//				System.out.print("*");
//			}
//			
//			for (int k = 2;k<2*i; k++) {
//				System.out.print(" ");
//			}
//
//			for (int j = n; j >=i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		int n = 5;
//		for (int i = 1; i <= n; i++) {
//			for(int k=1;k<=n-i;k++) {
//				System.out.print("_");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
//		for (int i = 1; i <= n; i++) {
//			
//			for(int j=n;j>=1;j--) {
//				
//			}
//		}
		int n = 4;
		for (int i = 1; i <= n; i++) {
				
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			
			
			System.out.println();
			
		}
		for (int i = n; i >=1; i--) {
			
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}

	}
}
