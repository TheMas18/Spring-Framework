package LeetCode;
//count 12 -> 2 digits so this is even number. count total even numbers
public class FindCountOfEvenNumber {
	public static void main(String[] args) {
		int[] nums = { 12, 345, 2, 6, 7896 };
		System.out.println(findNumbers(nums));
	}

	public static int findNumbers(int[] nums) {
		int count = 0;
		for (int r : nums) {

			if (isEven(r)) {
				count++;
			}
		}
		return count;
	}

	public static boolean isEven(int n) {
		int flag = 0;
		while (n != 0) {
			int d = n % 10;
			flag++;
			n = n / 10;

		}
		return flag % 2 == 0;
	}
}
