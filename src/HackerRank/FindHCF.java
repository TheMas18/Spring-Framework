package HackerRank;

import java.util.Scanner;

public class FindHCF {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int min=0;
		if(a<b) {
			min=a;
		}else {
			min=b;
		}
		
		for(int i=min; i>=1;i--) {
			if((a%i==0) &&(b%i==0)) {
				System.out.println("HCF is :" + i);
				break;
			}
		}
	}
}
