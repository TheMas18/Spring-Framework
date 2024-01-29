package Practice;

import java.util.Arrays;

public class P7 {

	public static void rotate(int[] nums, int k) {
		int n = nums.length;//7
		k = k % n;//3
		reverse(nums, 0, n - 1);//
		reverse(nums, 0, k - 1);
		reverse(nums, k, n - 1);
	}

	private static void reverse(int[] nums, int start, int end) {//5671234  4  5
		while (start < end) {
			int temp = nums[start];//3
			nums[start] = nums[end];//2
			nums[end] = temp;//7
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		rotate(nums, k);
		System.out.println("Rotated Array: " + Arrays.toString(nums));
	}
}
