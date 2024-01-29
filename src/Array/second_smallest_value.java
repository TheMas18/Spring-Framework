package Array;

public class second_smallest_value {
	public static void main(String[] args) {
		int a[] = { 10, 17, 28, 35, 73, 2, 43, 3, 50, 1 };
		int small = a[0];
		int second_smallest = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < small) {
				second_smallest = small;
				small = a[i];
			} else if (a[i] < second_smallest && a[i] != small) {
				second_smallest = a[i];
			}
		}
		System.out.println("Second Smallest Value :" + second_smallest);
	}
}
