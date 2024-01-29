package Array;

public class A3 {
	public static void main(String[] args) {
// prod of elements
		int b[] = { 1, 2, 3, 4, 5 };
		int prod = 1;
		for (int i = 0; i < b.length; i++) {
			prod = prod * b[i];
		}

		System.out.println("Total:" + prod);

	}
}
