package HackerRank;

import java.util.Scanner;

public class SOSmessageProblem {

	private static final String ORIGINAL_MESSAGE = "SOS";

	public static int marsExploration(String s) {
		//SOSSPSSQSSOR
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ORIGINAL_MESSAGE.charAt(i % 3)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();

		if (isValidInput(s)) {
			System.out.println(marsExploration(s));
		} else {
			System.out.println("Invalid input. Please provide a valid string.");
		}
	}

	private static boolean isValidInput(String s) {
		return s.length() >= 1 && s.length() <= 99 && s.length() % 3 == 0 && s.matches("[A-Z]+");
	}
	// matches("regex"); --->the matches method, you provide a regular expression as
	// the argument, and it checks whether the entire string matches that regular
	// expression. The matches method returns true if the entire string matches the
	// specified regular expression and false otherwise.
}

/*
 * Q A space explorer's ship crashed on Mars! They send a series of SOS messages
 * to Earth for help.
 * 
 * NASA_Mars_Rover.jpg
 * 
 * Letters in some of the SOS messages are altered by cosmic radiation during
 * transmission. Given the signal received by Earth as a string, , determine how
 * many letters of the SOS message have been changed by radiation.
 * 
 * Example
 * 
 * 
 * The original message was SOSSOS. Two of the message's characters were changed
 * in transit.
 * 
 * Function Description
 * 
 * Complete the marsExploration function in the editor below.
 * 
 * marsExploration has the following parameter(s):
 * 
 * string s: the string as received on Earth Returns
 * 
 * int: the number of letters changed during transmission Input Format
 * 
 * There is one line of input: a single string, .
 * 
 * Constraints
 * 
 * will contain only uppercase English letters, ascii[A-Z]. Sample Input 0
 * 
 * SOSSPSSQSSOR Sample Output 0
 * 
 * 3 Explanation 0
 * 
 * = SOSSPSSQSSOR, and signal length . They sent SOS messages (i.e.: ).
 * 
 * Expected signal: SOSSOSSOSSOS Recieved signal: SOSSPSSQSSOR Difference: X X X
 * Sample Input 1
 * 
 * SOSSOT Sample Output 1
 * 
 * 1 Explanation 1
 * 
 * = SOSSOT, and signal length . They sent SOS messages (i.e.: ).
 * 
 * Expected Signal: SOSSOS Received Signal: SOSSOT Difference: X Sample Input 2
 * 
 * SOSSOSSOS Sample Output 2
 * 
 * 0 Explanation 2
 * 
 * Since no character is altered, return 0.
 * 
 */
