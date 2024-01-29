package HackerRank;

import java.util.Scanner;
/*
 * Complete the 'hourglassSum' function below.
 *
 * The function is expected to return an INTEGER. The function accepts
 * 2D_INTEGER_ARRAY arr as parameter.
 */
//11 12 13   a b c
//	 22		   d
//31 32 33 	 e f g

//  a= i,j
//  b=i,j+1
//	c=i,j+2
//	d=i+1,j+1
//	e=i+2,j
//	f=i+2,j+1
//	g=i+2,j+2
public class HourglassSum {

	static int hourglassSum(int[][] arr) {
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				// Calculate the sum for the current hourglass
				int currentSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
						+ arr[i + 2][j + 1] + arr[i + 2][j + 2];

				// Update the maximum sum if the current sum is greater
				maxSum = Math.max(maxSum, currentSum);
			}
		}

		return maxSum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Take user input for the 2D array
		int[][] arr = new int[6][6];
		System.out.println("Enter the elements of the 6x6 array:");

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}

		// Calculate and print the result
		int result = hourglassSum(arr);
		System.out.println("Maximum Hourglass Sum: " + result);
	}
}

/*
 * 
 * Given a 2D Array, :
 * 
 * 1 1 1 0 0 0 0 1 0 0 0 0 1 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 An
 * hourglass in is a subset of values with indices falling in this pattern in 's
 * graphical representation:
 * 
 * a b c d e f g There are hourglasses in . An hourglass sum is the sum of an
 * hourglass' values. Calculate the hourglass sum for every hourglass in , then
 * print the maximum hourglass sum. The array will always be .
 * 
 * Example
 * 
 * 
 * -9 -9 -9 1 1 1 0 -9 0 4 3 2 -9 -9 -9 1 2 3 0 0 8 6 6 0 0 0 0 -2 0 0 0 0 1 2 4
 * 0 The hourglass sums are:
 * 
 * -63, -34, -9, 12, -10, 0, 28, 23, -27, -11, -2, 10, 9, 17, 25, 18 The highest
 * hourglass sum is from the hourglass beginning at row , column :
 * 
 * 0 4 3 1 8 6 6 Note: If you have already solved the Java domain's Java 2D
 * Array challenge, you may wish to skip this challenge.
 * 
 * Function Description
 * 
 * Complete the function hourglassSum in the editor below.
 * 
 * hourglassSum has the following parameter(s):
 * 
 * int arr[6][6]: an array of integers Returns
 * 
 * int: the maximum hourglass sum Input Format
 * 
 * Each of the lines of inputs contains space-separated integers .
 * 
 * Constraints
 * 
 * Output Format
 * 
 * Print the largest (maximum) hourglass sum found in .
 * 
 * Sample Input
 * 
 * 1 1 1 0 0 0 0 1 0 0 0 0 1 1 1 0 0 0 0 0 2 4 4 0 0 0 0 2 0 0 0 0 1 2 4 0
 * Sample Output
 * 
 * 19 Explanation
 * 
 * contains the following hourglasses:
 * 
 * image
 * 
 * The hourglass with the maximum sum () is:
 * 
 * 2 4 4 2 1 2 4
 */
