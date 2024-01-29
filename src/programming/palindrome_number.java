package programming;

public class palindrome_number {
	public static void main(String[] args) {
//	int n = 245;
//	int temp = n;
//	String rev = "";
//
//	while (n != 0) {
//		int d = n % 10;
//		rev = rev + d;
//		n = n / 10;
//	}
//	if (Integer.parseInt(rev) == temp) {
//		System.out.println(temp + " " + "Is a Palindrome Number");
//	} else {
//		System.out.println(temp + " " + "Is Not a Palindrome Number");
//	}

		// for range

		int count = 0;

		for (int n = 1; n <= 1000; n++) {
			int temp = n;
			String rev = "";
			while (n != 0) {
				int d = n % 10;
				rev = rev + d;
				n = n / 10;
			}
			if (Integer.parseInt(rev) == temp) {
				count++;
			
			} 
		}
		System.out.println(count);

	}
}
