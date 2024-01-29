package Array;

public class largest_element {
	public static void main(String[] args) {
		int a[] = { 10, 17, 28, 35, 73, 2 };
		int large=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>large) {
				large=a[i];
			}
		}
		System.out.println("Largest Value in Array :" + large);
	}
}
