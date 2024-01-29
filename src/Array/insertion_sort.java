package Array;

public class insertion_sort {
	public static void main(String[] args) {
		int a[] = { 6, 4, 5, 2, 1, 3 };
		for (int i = 1; i < a.length; i++) {//3
			int temp = a[i];//2
			int j = i - 1;//0
			while (j >= 0 && a[j] > temp) {//4>2
				a[j + 1] = a[j];//6
				j--;
			}
			a[j + 1] = temp;//4
		}
		 
		for (int i = 0; i < a.length; i++) { // for printing the sorted array
			System.out.print(a[i] + " ");
		}
	}
}
