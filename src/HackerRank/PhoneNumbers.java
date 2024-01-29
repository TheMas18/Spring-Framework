package HackerRank;

import java.util.*;
import java.util.Scanner;

public class PhoneNumbers {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			String str = sc.nextLine();
			String [] s = str.split(" ");
		
			
			String rev=" ";
			
			
			HashMap wordToDigitMap=new HashMap();
			wordToDigitMap.put("zero", "0");
			wordToDigitMap.put("one", "1");
			wordToDigitMap.put("two", "2");
			wordToDigitMap.put("three", "3");
			wordToDigitMap.put("four", "4");
			wordToDigitMap.put("five", "5");
			wordToDigitMap.put("six", "6");
			wordToDigitMap.put("seven", "7");
			wordToDigitMap.put("eight", "8");
			wordToDigitMap.put("nine", "9");
			
			int i=0;
			while(i<s.length) {
				if (s[i].contains("double")) {
					rev=rev+wordToDigitMap.get(s[i+1])+wordToDigitMap.get(s[i+1]);
					i++;
				} else if(s[i].contains("triple")){
					rev=rev+wordToDigitMap.get(s[i+1])+wordToDigitMap.get(s[i+1])+wordToDigitMap.get(s[i+1]);
					i++;
				}
				else {
					rev=rev+wordToDigitMap.get(s[i]);
				
				}
				i++;
			}
		
			System.out.println(rev);
		}
}
