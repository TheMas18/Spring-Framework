package programming;

public class DecimalToBinary {
	public static void main(String[] args) {
		int n = 25;
		String bin = Integer.toBinaryString(n);// Method 1
		System.out.println("Inbuilt Function: " + bin);
		String rev = ""; // Method 2
		while (n != 0) {
			int d = n % 2;
			rev = d + rev;

			n = n / 2;
		}
		System.out.println("Logic :" + rev);

		System.out.println("Binary to Decimal");

		System.out.println("Inbuilt Function :" + Integer.parseInt(rev, 2));

	}
}
