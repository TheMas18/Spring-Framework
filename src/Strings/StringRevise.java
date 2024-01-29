package Strings;

import java.util.Scanner;

//public class StringRevise {
//	public static void main(String[] args) {
//			Scanner sc=new Scanner(System.in);
//			String s=sc.nextLine();
//			
//			char ch[]=s.toCharArray();
//			boolean b[]=new boolean[ch.length];
//			
//			int flag=0;
//			
//			for (int i = 0; i < ch.length; i++) {
//				if(b[i]==false) {
//					int count=1;
//					for (int j = i+1; j< ch.length; j++) {
//						if(ch[i]==ch[j]) {
//							count++;
//							b[j]=true;
//						
//						}
//					}
//					if(count>1) {
//						flag++;
//					}System.out.println(ch[i] + ":  " + count);
//				}
//			}
//			System.out.println("Total Number Of Duplicates: " + flag);

//	String s="MayUResH";
//	char ch[]=s.toCharArray();
//	for (int i = 0; i < ch.length; i++) {
//		if(ch[i]>='a' && ch[i]<='z') {
//			ch[i]=(char)(ch[i]-32);
//			
//		}
//		else {
//			
//			ch[i]=(char)(ch[i]+32);
//		}
//	}
//	s =new String(ch);
//	System.out.println(s);
//	
//	

//public class StringRevise {
//	public static void main(String[] args) {
//		
//		String s = "I am Spiderman";
//		String s1[]=s.split(" ");
//		for (int i = 0; i < s1.length; i++) {
//			s1[i]=reverse(s1[i]);
//			System.out.print(s1[i]);
//		}
//	}
//
//	public static String reverse(String str) {
//		String rev=" ";
//		for (int i = 0; i < str.length(); i++) {
//			rev=str.charAt(i)+rev;
//		}
//		return rev;
//	}
//}
//public class StringRevise {

//	public static String vowel(String str) {
//		char ch[] = str.toCharArray();
//		for (int i = 0; i < ch.length; i++) {
//			if (ch[i] == 'a' && ch[i] == 'e' && ch[i] == 'i' && ch[i] == 'o' && ch[i] == 'u') {
//				ch[i] = '%';
//			}
//		}
//
//		return new String(ch);
//	}
//
//	public static String consonant(String str) {
//		char ch[] = str.toCharArray();
//		for (int i = 0; i < ch.length; i++) {
//			if (ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u') {
//				ch[i] = '#';
//			}
//		}
//
//		return new String(ch);
//	}
//
//	public static String upperCase(String str) {
//		char ch[] = str.toCharArray();
//		for (int i = 0; i < ch.length; i++) {
//			if (ch[i] >= 'a' && ch[i] <= 'z') {
//				ch[i] = (char) (ch[i] - 32);
//				
//			}
//		}
//
//		return new String(ch);
//	}

//	public static void main(String[] args) {
//		String s = "Meet me at the Clock Tower";
//		// Output M%%t #e AT th% ##o## TOWER
//
//		String[] a = s.split(" ");
//		for (int i = 0; i < a.length; i++) {
//			int x = i % 3;
//			switch (x) {
//			case 0: {
//				a[i] = vowel(a[i]);
//				break;
//			}
//			case 1: {
//				a[i] = consonant(a[i]);
//				break;
//			}
//
//			case 2: {
//				a[i] = upperCase(a[i]);
//				break;
//			}
//
//			}
//
//		}
//		
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//		}
//	}}

public class StringRevise {

	public static void main(String[] args) {
		String s="calculate";
		char c[]=s.toCharArray();
		
		boolean b[]=new boolean[c.length];
		boolean flag=true;
		for (int i = 0; i < c.length; i++) {
			if(b[i]==false) {
				int count=1;
				for (int j = i+1; j < c.length; j++) {
					if(c[i]==c[j]) {
						count++;
						b[j]=true;
					}
				}
				if(  flag==true && count==1) {
					System.out.println(c[i]+ " " + count);
					flag=false;
				}
				
			}
			
		}
		
	}
}





















