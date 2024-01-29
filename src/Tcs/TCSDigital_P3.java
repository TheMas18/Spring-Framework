package Tcs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TCSDigital_P3 {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		if (isPalindrome(s)==true) {
			System.out.println("Is Palindrome..");
		} else {
			System.out.println("Is Not An Palindrome..");
		}
	}
	
//	
//	public static boolean isPalindrome(String p) {
//		String rev="";	
//		for (int i = 0; i < p.length(); i++) {
//			
//			rev=rev+p.charAt(i);
//		}		
//		if (rev.equals(p)) {
//			return true;
//		} else {
//			return false;
//		}
//		
//		
//	}
	
	public static boolean isPalindrome(String p) {
		List<Character> list=new ArrayList<Character>();
		
		for (int i = 0; i < p.length(); i++) {
			if (list.contains(p.charAt(i))) {
				list.remove((Character)p.charAt(i));
			} else {
				list.add(p.charAt(i));
			}
			
			
		}
		if (p.length()%2==0 && list.isEmpty() || p.length()%2==1 && list.size()==1) {
			return true;
		} else {
			return false;
		}
		
	}
}
