package Array;

public class second_largest_value {
	public static void main(String[] args) {
//		int a[] = { 10, 17, 28, 35, 73, 2, 110, 30, 45, 240 };
		
		int a[] = { 10, -17, -28, -35, -73, 2, -110, 3, 5, -240 };
		int large = Integer.MIN_VALUE;
		int second_large = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > large) {
				second_large = large;
				large = a[i];
			} else if (a[i] > second_large && a[i] != large) {
				second_large = a[i];
			}
		}
		System.out.println("Second Largest Value :" + second_large);
	}

}
