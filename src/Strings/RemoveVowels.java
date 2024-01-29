package Strings;

public class RemoveVowels {
	public static void main(String[] args) {
		String s = "peter is spiderman";
		String rev = "";

		System.out.println(rev);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 'a'&& s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o'
					&& s.charAt(i) != 'u') {
				rev = rev + s.charAt(i);
			}
		}
		System.out.println(rev);
//				to display only vowels 
//				for (int i = 0; i < s.length(); i++) {
//					if (s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
//							rev=rev+s.charAt(i);
//					} 
//				}

	}
}
