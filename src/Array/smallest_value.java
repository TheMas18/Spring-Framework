package Array;

public class smallest_value {
	public static void main(String[] args) {
		int a[] = { 10, 17, 28, 35, 73, 2 };
		int small = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < small) {
				small = a[i];
			}
		}
		System.out.println("Largest Value in Array :" + small);
	}
}
