package Strings;

import java.util.Scanner;

//write a java program to check password is strong or weak
public class StrongPassword {
	public static void main(String[] args) {
		// 1 uppercase
		// 1 lowercase
		// number
		// special character
		// length 8
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		boolean upper = false;
		boolean lower = false;
		boolean num = false;
		boolean special = false;
		if (s.length() >= 8) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
					lower = true;
				} else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'B') {
					upper = true;
				} else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
					num = true;
				} else {
					special = true;
				}

			}

		} else {
			System.out.println("Length must be 8");
		}
		if (lower != true) {
			System.out.println("At least 1 lowercase is required");
		} else if (upper != true) {
			System.out.println("At least 1 uppercase is required");
		} else if (num != true) {
			System.out.println("At least 1 number is required");
		} else if (special != true) {
			System.out.println("At least 1 special is required");
		} else {
			System.out.println("Password is Strong");
		}
	}
}







