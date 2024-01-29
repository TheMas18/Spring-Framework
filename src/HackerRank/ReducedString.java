package HackerRank;

import java.util.Stack;

public class ReducedString {

	public static String superReducedString(String s) {
		Stack<Character> stack = new Stack<>();

		for (char c : s.toCharArray()) {
			if (!stack.isEmpty() && stack.peek() == c) {
				// If the current character matches the top of the stack, pop it (remove the
				// pair)
				stack.pop();
			} else {
				// Otherwise, push the current character onto the stack
				stack.push(c);
			}
		}

		// If the stack is empty, return "Empty String", otherwise, join the stack
		// elements
		return stack.isEmpty() ? "Empty String" : stackToString(stack);
	}

	private static String stackToString(Stack<Character> stack) {
		StringBuilder sb = new StringBuilder();
		for (char c : stack) {
			sb.append(c);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
        String inputString = "baacaabc";
        String result = superReducedString(inputString);
        System.out.println(result);
    }
}

/*
 * Q Reduce a string of lowercase characters in range ascii[‘a’..’z’]by doing a
 * series of operations. In each operation, select a pair of adjacent letters
 * that match, and delete them.
 * 
 * Delete as many characters as possible using this method and return the
 * resulting string. If the final string is empty, return Empty String
 * 
 * Example.
 * 
 * 
 * aab shortens to b in one operation: remove the adjacent a characters.
 * 
 * 
 * Remove the two 'b' characters leaving 'aa'. Remove the two 'a' characters to
 * leave ''. Return 'Empty String'.
 * 
 * Function Description
 * 
 * Complete the superReducedString function in the editor below.
 * 
 * superReducedString has the following parameter(s):
 * 
 * string s: a string to reduce Returns
 * 
 * string: the reduced string or Empty String Input Format
 * 
 * A single string, .
 * 
 * Constraints
 * 
 * Sample Input 0
 * 
 * aaabccddd Sample Output 0
 * 
 * abd Explanation 0
 * 
 * Perform the following sequence of operations to get the final string:
 * 
 * aaabccddd → abccddd → abddd → abd Sample Input 1
 * 
 * aa Sample Output 1
 * 
 * Empty String Explanation 1
 * 
 * aa → Empty String Sample Input 2
 * 
 * baab Sample Output 2
 * 
 * Empty String Explanation 2
 * 
 * baab → bb → Empty String
 * 
 */
