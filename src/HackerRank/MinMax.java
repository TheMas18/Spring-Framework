package HackerRank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class MinMax {
	public static void miniMaxSum(List<Integer> arr) {
		long maxSum = Long.MIN_VALUE;
		long minSum = Long.MAX_VALUE;

		for (int i = 0; i < arr.size(); i++) {
			long sum = 0;

			for (int j = 0; j < arr.size(); j++) {
				if (i != j) {
					sum += arr.get(j);
				}
			}

			maxSum = Math.max(maxSum, sum);
			minSum = Math.min(minSum, sum);
		}

		System.out.println(minSum + " " + maxSum);

	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		miniMaxSum(arr);

		bufferedReader.close();
	}
}

/*
 * Given five positive integers, find the minimum and maximum values that can be
 * calculated by summing exactly four of the five integers. Then print the
 * respective minimum and maximum values as a single line of two space-separated
 * long integers.
 * 
 * Example
 * 
 * The minimum sum is and the maximum sum is . The function prints
 * 
 * 16 24 Function Description
 * 
 * Complete the miniMaxSum function in the editor below.
 * 
 * miniMaxSum has the following parameter(s):
 * 
 * arr: an array of integers Print
 * 
 * Print two space-separated integers on one line: the minimum sum and the
 * maximum sum of of elements.
 * 
 * Input Format
 * 
 * A single line of five space-separated integers.
 * 
 * Constraints
 * 
 * 
 * Output Format
 * 
 * Print two space-separated long integers denoting the respective minimum and
 * maximum values that can be calculated by summing exactly four of the five
 * integers. (The output can be greater than a 32 bit integer.)
 * 
 * Sample Input
 * 
 * 1 2 3 4 5 Sample Output
 * 
 * 10 14 Explanation
 * 
 * The numbers are , , , , and . Calculate the following sums using four of the
 * five integers:
 * 
 * Sum everything except , the sum is . Sum everything except , the sum is . Sum
 * everything except , the sum is . Sum everything except , the sum is . Sum
 * everything except , the sum is . Hints: Beware of integer overflow! Use
 * 64-bit Integer.
 * 
 * 
 * 
 */