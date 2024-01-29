package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayPractice {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 4;

		rotate(nums, k);
		System.out.println(Arrays.toString(nums));
	}

	public static void rotate(int[] nums, int k) {
		int n = nums.length;
		k = k % n;
		reverse(nums, 0, n - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, n - 1);

	}

	public static void reverse(int[] nums, int start, int end) {
		// TODO Auto-generated method stub
		while (start < end) {

			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}

	}
	

//	public static void main(String[] args) {
//		int[] intArray = {1, 2, 3};
//		double[] doubleArray = {1.0, 2.0, 3.0};
//		char[] charArray = {'a', 'b', 'c'};
//
//		System.out.println(intArray+"s");    // Prints content: [1, 2, 3]
//		System.out.println(doubleArray); // Prints content: [1.0, 2.0, 3.0]
//		System.out.println(charArray);   
//	}

	@Override
	public String toString() {
		return "ArrayPractice [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
