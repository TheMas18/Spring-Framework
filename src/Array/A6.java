package Array;

import java.util.Scanner;

public class A6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID : ");
		int id = sc.nextInt();
		System.out.print("Enter Percent : ");
		double percent = sc.nextDouble();
		System.out.print("Enter Full Name : ");
		sc.nextLine();
		String s = sc.nextLine(); // this will store only space due to new line

		// We can reinitialize or else we can write sc.nextLine() before initialization
//		s = sc.nextLine();
		System.out.println(s + " "+id + " " + percent );
	}
}
