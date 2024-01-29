package Strings;

public class S1 {

	public static void main(String[] args) {

//	String s="Hello";
//	String s1="Hello";
//	System.out.println(s==s1); // true because it will compare data
//	System.out.println(s.equals(s1)); //true

//	String s=new String("Hello");
//	String s1=new String("Hello");
//	System.out.println(s==s1); // false due it will compare address
//	System.out.println(s.equals(s1)); //true

//		String s="Thane";
//		System.out.println(s.length());  // length of string
//		System.out.println(s.charAt(0)); // returns value of given index

		
		// to uppercase
//		String s = "jAvA";
//		char[] ch = s.toCharArray();
//		for (int i = 0; i < ch.length; i++) {
//			if (ch[i] >= 'a' && ch[i] <= 'z') {
//				ch[i] = (char) (ch[i] - 32);
//				
//			}
//			
//		}
//		String s2=new String(ch);
//		System.out.println(s2);
		

		// to lowercase
		String s = "jAvA";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) (ch[i] + 32);
				
			}
			
		}
		String s2=new String(ch);
		System.out.println(s2);
	}
}
