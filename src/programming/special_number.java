package programming;

public class special_number {
	public static void main(String[] args) {
		int n = 19;
		int sp = n;
		int sum = 0;
		int prod = 1;
		while (n != 0) {
			int d = n % 10;
			sum = sum + d;
			prod = prod * d;
			n = n / 10;
		}
		int temp = sum + prod;
		if (temp == sp) {
			System.out.println(sp + " " + "Is a Special Number");
		} else {
			System.out.println(sp + " " + "Is  not a Special Number");
		}

		// for range
//		int sum = 0;
//		int prod = 1;
//		int count = 0;
//		for (int n = 1; n <= 10; n++) {
//			int sp = n;
//			
//			while (n != 0) {
//				int d = n % 10;
//				sum = sum + d;
//				prod = prod * d;
//				n = n / 10;
//			}
//			int temp = sum + prod;
//			if (temp == sp) {
//				count++;
//				System.out.println(sp + " " + "Is a Special Number");
//			} else {
//				System.out.println(sp + " " + "Is  not a Special Number");
//			}
//		}
//		System.out.println(count);

	}
}
