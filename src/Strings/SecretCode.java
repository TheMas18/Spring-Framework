package Strings;

public class SecretCode {
	public static void main(String[] args) {
		String s = "Meet me at the Clock Tower";
		// Output M%%t #e AT th% ##o## TOWER

		String[] a = s.split(" ");
		
		for (int i = 0; i < a.length; i++) {
			int x = i % 3;
			switch (x) {
			case 0: {

				a[i] = vowel(a[i]);
				break;
			}
			case 1: {
				a[i] = consonant(a[i]);
				break;
			}
			case 2: {
				a[i] = uppercase(a[i]);
				break;
			}
			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	static String uppercase(String s) {
		char[] c = s.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (c[i] >= 'a' && c[i] <= 'z') {
				c[i] = (char) (c[i] - 32);

			}

		}
		return new String(c);
	}

	static String consonant(String s) {
		char[] c = s.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (c[i] != 'a' && c[i] != 'e' && c[i] != 'i' && c[i] != 'o' && c[i] != 'u') {
				c[i] = '#';
			}
		}
		return new String(c);
	}

	static String vowel(String s) {
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
				c[i] = '%';

			}
		}
		return new String(c);
	}
}
