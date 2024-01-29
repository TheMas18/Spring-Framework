package Tcs;

import java.util.*;

public class TCSDigital_P4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		int k=sc.nextInt();
		
		Arrays.sort(arr);//10 20 30 40 50 
		for (int i = 0; i < k; i++) {
			int last=arr[arr.length-1];
			for (int j = arr.length-1; j>0; j--) {//50
				arr[j]=arr[j-1];
				arr[j-1]=last;
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
