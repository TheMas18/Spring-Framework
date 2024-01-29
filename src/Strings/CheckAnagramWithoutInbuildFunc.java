package Strings;

public class CheckAnagramWithoutInbuildFunc {
	public static void main(String[] args) {

		String s1 = "eat";
		String s2 = "eat";

		String s1Sorted = sortString(s1);
		String s2Sorted = sortString(s2);

		if (areAnagrams(s1Sorted, s2Sorted)) {
			System.out.println("The strings are anagrams.");
		} else {
			System.out.println("The strings are not anagrams.");
		}

	}

	private static String sortString(String input) {
		char[] charArray = new char[input.length()];
		for (int i = 0; i < input.length(); i++) {
			charArray[i] = input.charAt(i);
		}

		for (int i = 0; i < charArray.length - 1; i++) {
			for (int j = 0; j < charArray.length - i - 1; j++) {
				if (charArray[j] > charArray[j + 1]) {

					char temp = charArray[j];
					charArray[j] = charArray[j + 1];
					charArray[j + 1] = temp;
				}
			}
		}
		StringBuilder sortedString = new StringBuilder();
		for (char c : charArray) {
			sortedString.append(c);
		}

		return sortedString.toString();
	}

	public static boolean areAnagrams(String str1, String str2) {
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
