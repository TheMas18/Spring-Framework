package programming;

public class separate_the_digits {
	public static void main(String[] args) {
		int n = 143;
		while (n != 0) {
			int d=n%10;
			System.out.print(d + " ");
			n=n/10;
		}
		
	}
}
