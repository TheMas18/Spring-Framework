package Practice;

import java.util.Scanner;

public class DateProblems {
/*	public static String timeConversion(String s) {
		// Split the input string into hours, minutes, seconds, and AM/PM parts
		String[] timeParts = s.split(":");
		int hours = Integer.parseInt(timeParts[0]); // hours = 7
		int minutes = Integer.parseInt(timeParts[1]); // minutes = 05
		String secondsAndMeridiem = timeParts[2]; // secondsAndMeridiem = "45PM"

		// Check if it's PM and not 12:00 PM
		if (s.contains("PM") && hours != 12) {
			hours = (hours + 12) % 24; // Adjust hours to 19 (7 + 12)
		}

		// Check if it's AM and 12:00 AM
		if (s.contains("AM") && hours == 12) {
			hours = 0; // Adjust hours to 0 (12:00 AM in 24-hour time)
		}

		// Convert back to string with leading zeros if needed
		String formattedHours = String.format("%02d", hours); // formattedHours = "19"
		String formattedMinutes = String.format("%02d", minutes); // formattedMinutes = "05"

		// Reconstruct the 24-hour time string
		return formattedHours + ":" + formattedMinutes + ":" + secondsAndMeridiem.substring(0, 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(timeConversion(s));
	}
	*/
}
