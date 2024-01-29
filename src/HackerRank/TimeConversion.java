package HackerRank;

import java.io.*;

public class TimeConversion {
	public static String timeConversion(String s) { // 07:05:45PM
		// Write your code here
		int hours = Integer.parseInt(s.substring(0, 2));
		int minutes = Integer.parseInt(s.substring(3, 5));
		int seconds = Integer.parseInt(s.substring(6, 8));

		// Check if it's PM and not 12:00:00 PM
		if (s.endsWith("PM") && hours != 12) {
			hours += 12;
		}

		// Check if it's AM and 12:00:00 AM
		if (s.endsWith("AM") && hours == 12) {
			hours = 0;
		}

		// Format the result as 24-hour time
		return String.format("%02d:%02d:%02d", hours, minutes, seconds);

	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = bufferedReader.readLine();

		String result = timeConversion(s);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
/*
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.
 * 
 * Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock. -
 * 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 * 
 * Example
 * 
 * 
 * Return '12:01:00'.
 * 
 * 
 * Return '00:01:00'.
 * 
 * Function Description
 * 
 * Complete the timeConversion function in the editor below. It should return a
 * new string representing the input time in 24 hour format.
 * 
 * timeConversion has the following parameter(s):
 * 
 * string s: a time in hour format Returns
 * 
 * string: the time in hour format Input Format
 * 
 * A single string that represents a time in -hour clock format (i.e.: or ).
 * 
 * Constraints
 * 
 * All input times are valid Sample Input
 * 
 * 07:05:45PM Sample Output
 * 
 * 19:05:45
 * 
 * 
 * 
 */