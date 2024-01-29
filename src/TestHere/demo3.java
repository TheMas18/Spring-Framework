package TestHere;

import java.util.*;

public class demo3 {
	public static int ArrayProblem(int[] arr, int k) {
		int total = 0;
		int sum=0;
		int count=0;
		for (int i = 0; i < arr.length; i++) {//1 2 3 4
			for (int j = i+1; j < arr.length; j++) {
				sum=arr[i]+arr[j];
				if(sum==k) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k;
		n = sc.nextInt();//4
		k = sc.nextInt();//3
		int[] arr = new int[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = sc.nextInt();
		}
		if ((n >= 1 && n <= 10000) && (k >= 1 && k <= 100000000) && (arr.length >= 1 && arr.length <= 10000)) {
			System.out.println(ArrayProblem(arr, k));
		}
	}
}