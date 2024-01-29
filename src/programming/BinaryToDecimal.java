package programming;

public class BinaryToDecimal {
	public static void main(String[] args) {
		int n = 11001;
		int dec = 0;
		int base = 1;
		while (n != 0) {
			int d = n % 10;
			dec = dec + d * base;
			base = base * 2;
			n = n / 10;

		}
		System.out.println("Logic :" + dec);

	}
}
