package Strings;

public class SplitTheString {
	public static void main(String[] args) {
		//if s= i am spiderman
		//then print spiderman am i
		
		
		String s = "I am spiderman";
		String  s1[]=s.split(" ");
		for (int i = s1.length-1; i >=0; i--) {
			System.out.print(s1[i]+ " ");
		}
		
	}
}
