package Practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class LearnTransient {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n = sc.nextInt();
//		long []arr=new long[n];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]=sc.nextLong();
//		}
//		long result=sum(arr);
//	}
//	public static long sum(long [] arr) {
//		int result=0;
//		for(long o:arr) {
//			result+=o;
//		}
//		return result;
//	}
	// 00 01 02
	// 10 11 12
	// 20 21 22

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int arr[][] = new int[n][n];
//		int sum1 = 0;
//		int sum2 = 0;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				arr[i][j] = sc.nextInt();
//				if (i == j ) {
//					sum1=sum1+arr[i][j];
//				}
//				if (i + j == 2) {
//					sum2=sum2+arr[i][j];
//				}
//			}
//		}
//		System.out.println(sum1-sum2);
//		Scanner sc = new Scanner(System.in);
//		 long[] arr = new long[5];
//		 	long sum=0;
//	        for (int i = 0; i < 5; i++) {
//	            arr[i] = sc.nextLong();
//	            sum=sum+arr[i];
//	        }
//	        Arrays.sort(arr);
//	        long max=arr[4];
//	        long min=arr[0];
//	        long minSum = sum - max;
//	        long maxSum = sum - min;
//
//	        System.out.println(minSum + " " + maxSum);

	}
}

/*
 * Serialization is the process of converting an object into a format that can
 * be easily saved to a file or sent over a network. Think of it as turning an
 * object into a string of bytes.
 * 
 * class Person { String name; int age;
 * 
 * } When you serialize this object, it means you're turning it into a format
 * that can be saved or sent. However, there might be some data in the object
 * that you don't want to save or send. That's where the transient keyword comes
 * in.
 * 
 * For example:
 * 
 * class Person { String name; transient int age; // This field is marked as
 * transient
 * 
 * // Constructor and other methods... } With age marked as transient, it tells
 * Java to exclude this field when saving or sending the object. So, when you
 * deserialize (convert it back into an object) after serialization, the age
 * field will be set to its default value (which is 0 for an int).
 * 
 * In simple terms, transient is like saying, "Don't save or send this
 * particular piece of data when you're saving or sending the object." It's a
 * way to control what gets included and what doesn't when working with
 * serialized objects.
 */