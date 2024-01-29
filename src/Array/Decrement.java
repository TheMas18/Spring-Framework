package Array;

public class Decrement {
	public static void main(String[] args) {
		int a[] = { 0, 16, 12, 25, 15 };
		int count = 0;
		int n = 6;
		for (int i = 0; i < a.length; i++) {
			while (a[i] % n != 0) {
				a[i]--;//
				count++;//8
			}
		}
		System.out.println(count);

		
		//method 2
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//			sum = sum + a[i] % 6;
//		}
//		System.out.println(sum);
	}
}
