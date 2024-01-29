package Tcs.JavaProb;

import java.util.Scanner;

//Q read an amount and split into 1 rs,10rs,100rs,500rs and 2000rs denominations
public class P1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		

	        System.out.print("Enter the amount: ");
	        int amount = sc.nextInt();//12345
	        
	        int rs2000 = amount / 2000;//6
	        amount = amount % 2000;//345

	        int rs500 = amount / 500;//0
	        amount = amount % 500;//0

	        int rs100 = amount / 100;//3
	        amount = amount % 100;//45

	        int rs10 = amount / 10;//4
	        amount = amount % 10;//5

	        int rs1 = amount;//5

	  
	        System.out.println("Rs. 2000 notes: " + rs2000);
	        System.out.println("Rs. 500 notes: " + rs500);
	        System.out.println("Rs. 100 notes: " + rs100);
	        System.out.println("Rs. 10 notes: " + rs10);
	        System.out.println("Rs. 1 coins: " + rs1);
		
	}
}
