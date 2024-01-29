package Strings;

import java.util.Scanner;

public class Duplicates {
public static void main(String[] args) {
//	String s="Maharashtra";
	System.out.println("Enter Element : ");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	char []ch=s.toCharArray();
	
	boolean[] b=new boolean[ch.length];//fffffffffff
	
	int flag=1;
	for (int i = 0; i < ch.length; i++) {//
		
			if (b[i]==false ) {
				int count=1;//1
				for (int j = i+1; j < ch.length; j++) {//5
					if(ch[i]==ch[j]) {
						count++;//3
						b[j]=true;
					}
				}
				if(count>1) {
					flag++;
				}
				System.out.println(ch[i] + ":  " + count);
			}
		
		
		
	}
	System.out.println("Total Number Of duplicates : "+ flag);
}
}
