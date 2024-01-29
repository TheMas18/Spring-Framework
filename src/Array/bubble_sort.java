package Array;

public class bubble_sort {
	public static void main(String[] args) {
		int a[] = { 5, 4, 6, 2, 3, 1 };
		int count = 0;
		for (int i = 0; i < a.length; i++) { // for the first value

			for (int j = i + 1; j < a.length; j++) { // for the next value
				count++;
				if (a[i] > a[j]) {
					int temp = a[i];//4
					a[i] = a[j];//2
					a[j] = temp;//5
				}
			}
		
		}
		for (int i = 0; i < a.length; i++) { // for printing the sorted array
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("Largest Element In The Array Is: " + a[a.length-1]);
		System.out.println("Second Largest Element In The Array Is: " + a[a.length-2]);
		System.out.println("Third Largest Element In The Array Is: " + a[a.length-3]);
		System.out.println("Total Number Of Iterations :" + count);
	}
}
