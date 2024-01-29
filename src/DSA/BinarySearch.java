package DSA;

public class BinarySearch {
	public static void main(String[] args) {
//		int[] nums = { 1, 2, 3, 4, 5, 6, 8 };
		int[] nums = { 10, 9, 6, 2, 1 };
		System.out.println(binarySearch(nums, 2));

	}

	public static int binarySearch(int[] nums, int search) {
		int start = 0;
		int end = nums.length - 1;
		// 3

		// if sorted array is given but it we dont know its ascending or desc
		boolean orderAgnostic = nums[start] < nums[end];

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (search == nums[mid]) {
				return mid;

			}
			if (orderAgnostic) {

				if (search < nums[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (search > nums[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}

		}

		return -1;
	}
}
