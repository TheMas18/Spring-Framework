package Strings;

public class StrP2 {
	//Q  ())()()))(  COUNT NO OF ()
public static void main(String[] args) {
	String s="())()()))(()()))())()";
	int count=0;
	for (int i = 0; i < s.length()-1; i++) {
		if (s.charAt(i)=='(' && s.charAt(i+1)==')') {
			count++;
		}
	}
	System.out.println(count);
}
}
