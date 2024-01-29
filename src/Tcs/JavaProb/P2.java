package Tcs.JavaProb;

import java.util.Scanner;

//Q THERE are n batches of students in a course and there are M students in each batch . 
//Read N and M and then read the total score of each student(out of thousand) 
//in each batch.calculate average  score of each batch and print it

// input :  N-> 2, 	M ->5

//700 800 600 500 900
//900 700 600 950 860

//Output : batch1 average ->700 batch 2 -> average->802

public class P2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		
		
		for (int i = 0; i < N; i++) {
			int sum=0;
			int count=0;
			
			for (int j = 0; j < 5; j++) {
				int M = sc.nextInt();
				sum=sum+M;
				count++;
			}
			System.out.println("Average Of Batch 1 is : " + (sum=sum/count));
		}
	}
}
