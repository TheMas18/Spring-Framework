package Array;

import java.util.Scanner;

public class A5 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter Size Of Array: ");
//		int size = sc.nextInt();
//		int a[] = new int[size];
//
//		System.out.println("Enter The Elements : ");
//		for (int i = 0; i < size; i++) {
//			a[i] = sc.nextInt();
//		}
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]);
//		}
//		sc.close();

		// search for the number
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size Of Array: ");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.println("Enter The Elements : ");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("[" + " ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
		
		System.out.println();
		System.out.println("Enter the Element : ");
		int x = sc.nextInt();

		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				System.out.println("Element " + x + " Found At Index : " + i);
			}
		}
		sc.close();
	}
}
