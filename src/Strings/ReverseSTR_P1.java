package Strings;

public class ReverseSTR_P1 {
	public static void main(String[] args) {
		// reverse the string maintaining same position
		// i am spiderman
		// i ma namredips

		String s = "I am spiderman";
		String s1[] = s.split(" ");
	
		for (int i = 0; i < s1.length; i++) {
			s1[i] = reverse(s1[i]);
			System.out.print(s1[i] + " ");
		}

	}

	public static String reverse(String s) {//am
		String rev = " ";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		return rev;
	}

}
