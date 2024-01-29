package Tcs;

import java.util.*;

public class TCSDigital_P2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String i = sc.nextLine();
		String w = sc.nextLine();

		System.out.println(canComplete(i, w));

	}

	static boolean canComplete(String i, String w) {
		
		int v=0;
		String rev = "";

		for (int j = 0; j < i.length(); j++) {
			for (int j2 = v; j2 < w.length(); j2++) {

				if (i.charAt(j) == w.charAt(j2)) {
					v = j2;
					rev = rev + i.charAt(j);
					break;
				}

			}
		}

		if (rev.equals(i)) {
			return true;
		} else {
			return false;
		}

	}
}
