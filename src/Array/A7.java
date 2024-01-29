package Array;

import java.util.Arrays;

public class A7 {
	public static void main(String[] args) {
		
		// sort method
//		int a[] = { 15, 35, 47, 12, 48, 10, 65, 1, 6, 4 };
//		Arrays.sort(a);
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//		}

		char[] ch = { 'z', 'a', 'c', 'x', 'y', 'b', 'h' };

		for (int i = 0; i < ch.length; i++) {

			for (int j = i + 1; j < ch.length; j++) { 
				if (ch[i] > ch[j]) {
					int temp = ch[i];
					ch[i] = ch[j];
					ch[j] = (char)temp;
				}
			
			}
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
	}
}
