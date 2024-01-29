
package HackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class StringCompressor {

	public static String compressString(String input) { 
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		//a3b2c4a2
		//01234567
		for(int i=0;i<input.length();i+=2) {
			char character=input.charAt(i);
			int frequency= Character.getNumericValue(input.charAt(i+1));
		
			map.put(character, map.getOrDefault(character, 0)+frequency);//a5b2c4
		}
		
		TreeSet<Character> set=new TreeSet<Character>(map.keySet());
		
		StringBuilder compressedString=new StringBuilder();
		for(char c:set) {
			compressedString.append(c).append(map.get(c));
		}
		
		return compressedString.toString();
	}

	public static String perfectString(String str) {
	    StringBuilder rev = new StringBuilder();
	    for (int i = 0; i < str.length(); i += 2) {
	        char c = str.charAt(i);
	        int freq = Character.getNumericValue(str.charAt(i + 1));
	        rev.append(String.valueOf(c).repeat(Math.max(0, freq)));
	    }
	    return rev.toString();
	}
	public static void main(String[] args) {
		String input = "a3b2c4a2";
		String compressedString = compressString(input);

		System.out.println("Original String: " + input);
		System.out.println("Compressed String: " + compressedString);
		System.out.println("Perfect String: " + perfectString(compressedString));
	}
}