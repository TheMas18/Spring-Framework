package HackerRank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
	public static void plusMinus(List<Integer> arr) {// -4, 3, -9, 0, 4, 1
		double positive = arr.stream().filter(n -> n > 0).count();
		double negative = arr.stream().filter(n -> n < 0).count();
		double zero = arr.stream().filter(n -> n == 0).count();

		// Print the ratios with six decimal places using System.out.printf
		System.out.printf("%.6f%n", positive / arr.size());
		System.out.printf("%.6f%n", negative / arr.size());
		System.out.printf("%.6f%n", zero / arr.size());

		/*
		 * we are converting it to stream then we are using filter so it will filter
		 * according to the condition in the expression count() will count the elements
		 * which are filtered
		 * 
		 * .6 means we need elements till 6 decimals f means float n means new line %
		 * means we are adding elements here weneed printf
		 * 
		 */
	}

}

public class PlusMinus {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		Result.plusMinus(arr);

		bufferedReader.close();
	}
}

/*
 * 
 * Given an array of integers, calculate the ratios of its elements that are
 * positive, negative, and zero. Print the decimal value of each fraction on a
 * new line with places after the decimal.
 * 
 * Note: This challenge introduces precision problems. The test cases are scaled
 * to six decimal places, though answers with absolute error of up to are
 * acceptable.
 * 
 * Example
 * 
 * There are elements, two positive, two negative and one zero. Their ratios are
 * , and . Results are printed as:
 * 
 * 0.400000 0.400000 0.200000 Function Description
 * 
 * Complete the plusMinus function in the editor below.
 * 
 * plusMinus has the following parameter(s):
 * 
 * int arr[n]: an array of integers Print Print the ratios of positive, negative
 * and zero values in the array. Each value should be printed on a separate line
 * with digits after the decimal. The function should not return a value.
 * 
 * Input Format
 * 
 * The first line contains an integer, , the size of the array. The second line
 * contains space-separated integers that describe .
 * 
 * Constraints
 * 
 * 
 * 
 * Output Format
 * 
 * Print the following lines, each to decimals:
 * 
 * proportion of positive values proportion of negative values proportion of
 * zeros Sample Input
 * 
 * STDIN Function ----- -------- 6 arr[] size n = 6 -4 3 -9 0 4 1 arr = [-4, 3,
 * -9, 0, 4, 1] Sample Output
 * 
 * 0.500000 0.333333 0.166667 Explanation
 * 
 * There are positive numbers, negative numbers, and zero in the array. The
 * proportions of occurrence are positive: , negative: and zeros: .
 * 
 */