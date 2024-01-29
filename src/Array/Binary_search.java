package Array;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class Binary_search {
	public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 8 };
        Arrays.sort(a);
        int li = 0;  // 0
        int hi = a.length - 1;//7
        int mi = (li + hi) / 2;//6
        System.out.println(mi);
        int search = 8;
        int flag = 0;//2
        while (li <= hi) {
            if (search == a[mi]) {
                System.out.println("Element is found at index: " + mi);
                flag = 1;
                break;
            } else if (search > a[mi]) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
            mi = (li + hi) / 2;
            flag++;
        }
        if (flag == a.length) {
            System.out.println("Element: " + search + " is not present");
        }
    
//		  	List<Integer> list = List.of(1, 3, 5, 7, 9, 11, 13);
//	        int index = Collections.binarySearch(list, 9);
//	        if (index >= 0) {
//	            System.out.println("7 found at index " + index);
//	        } else {
//	            System.out.println("7 not found in the list");
//	        }
	}
}
