package HackerRank;

import java.io.*;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class UniqueElement {
	public static int lonelyinteger(List<Integer> a) {
		int result = 0;

		// XOR all elements in the array
		for (int i : a) {
			result ^= i;
		}

		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		int result = lonelyinteger(a);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}

/*
 * Given an array of integers, where all elements but ooccur twice, find the
 * unique element.
 * 
 * Example
 * 
 * The unique element is .
 * 
 * Function Description
 * 
 * Complete the lonelyinteger function in the editor below.
 * 
 * lonelyinteger has the following parameter(s):
 * 
 * int a[n]: an array of integers Returns
 * 
 * int: the element that occurs only once Input Format
 * 
 * The first line contains a single integer, , the number of integers in the
 * array. The second line contains space-separated integers that describe the
 * values in .
 * 
 * Constraints
 * 
 * It is guaranteed that is an odd number and that there is one unique element.
 * , where .
 * 
 * The logic behind the code result ^= i; is using the XOR (exclusive OR) operation to find the unique element in an array where all other elements occur twice.

Here's the basic idea:

XOR Property: XORing a number with itself results in 0 (a ^ a = 0).

XORing All Elements: If you XOR all the elements in the array where each element occurs twice, every paired element will cancel each other out (because XORing with the same number results in 0).

Unique Element: The element that occurs only once will not be canceled out, and its value will be the result of the XOR operation.

Let's break it down:

java
Copy code
int result = 0;

// XOR all elements in the array
for (int i : a) {
    result ^= i;
}
Initially, result is set to 0. Then, for each element i in the array a, it XORs the current value of result with i. After going through all elements, result will contain the XOR of all elements in the array.

The key property here is that if an element occurs twice, its contribution to result will be canceled out due to the XOR operation. The only element that will remain in result is the one that occurs only once.

So, the final value of result after the loop represents the unique element in the array. This is a clever and efficient way to find the odd-occurring element without explicitly counting occurrences or using additional data structures.






 * 
 */