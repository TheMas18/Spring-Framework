package HackerRank;

import java.util.HashSet;
import java.util.Scanner;

public class Solution {
	/*
	 * abccddde 6  1 3 12 5 9 10
	 */
	static String[] weightedUniformStrings(String s, int[] queries) {
		HashSet<Integer> weightsSet = new HashSet<>();//12
		char prevChar = ' ';//b
		int currentWeight = 0;//1

		for (char c : s.toCharArray()) {
			if (c == prevChar) {
				currentWeight += c - 'a' + 1;
			} else {
				currentWeight = c - 'a' + 1;
			}

			weightsSet.add(currentWeight);
			prevChar = c;
		}

		String[] result = new String[queries.length];
		for (int i = 0; i < queries.length; i++) {
			if (weightsSet.contains(queries[i])) {
				result[i] = "Yes";
			} else {
				result[i] = "No";
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int numQueries = scanner.nextInt();

		// Check constraints outside the loop
		if (s.length() >= 1 && s.length() <= Math.pow(10, 5) && numQueries >= 1 && numQueries <= Math.pow(10, 5)) {
			int[] queries = new int[numQueries];

			for (int i = 0; i < numQueries; i++) {
				queries[i] = scanner.nextInt();
				// Skip invalid queries instead of breaking the loop
				if (!(queries[i] >= 1 && queries[i] <= Math.pow(10, 7))) {
					i++;
				}
			}

			String[] result = weightedUniformStrings(s, queries);

			for (String res : result) {
				System.out.println(res);
			}
		}

		scanner.close();
	}
}