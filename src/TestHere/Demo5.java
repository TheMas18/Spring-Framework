package TestHere;

import java.util.Arrays;
import java.util.Hashtable;

public class Demo5 {

	public static void main(String args[]) {
		int i = 10;
		int j = --i;
		int k = j++;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		k = --j;
		System.out.println(k);
		j--;
		++k;
		--i;
		--j;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(i++);
		System.out.println(--j);
		System.out.println(k++);
	}
}
