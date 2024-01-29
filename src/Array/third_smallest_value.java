package Array;

public class third_smallest_value {
	public static void main(String[] args) {
		int a[] = { 2,10, 17, 28, 35, 73, 22, 43,9, 33, 50, 1};
		int small = a[0];//10

		int max = a[0];//1
		for (int j = 0; j < a.length; j++) {
			if (a[j] > max) {
				max = a[j];//73
			}
		}
		int second_smallest = max;//10
		int third_smallest = max;//17

		for (int i = 0; i < a.length; i++) {
			if (a[i] < small) {
				third_smallest = second_smallest;
				second_smallest = small;
				small = a[i];
			} else if (a[i] < second_smallest && a[i] != small) {
				third_smallest = second_smallest;
				second_smallest = a[i];
			} else if (a[i] < third_smallest && a[i] != second_smallest) {
				third_smallest = a[i];
			}
		}
		System.out.println("Third Smallest Value in the Array Is:" + third_smallest);
	}
}
