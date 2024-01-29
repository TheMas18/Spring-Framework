package programming;

public class perfect_number {
	public static void main(String[] args) {
		int n = 6; // 1 3 2

		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n) {
			System.out.println(n + " " + "is a perfect number");
		} else {
			System.out.println(n + " " + "is not  a perfect number");
		}

		
		//for range


//		
//		int count=0;
//		for(int n=1;n<=100;n++) {
//		
//			int sum = 0;
//			for (int i = 1; i < n; i++) {
//				if (n % i == 0) {
//					sum = sum + i;
//				}
//			}
//			if (sum == n) {
//				count++;
//				System.out.println(n + " " + "is a perfect number");
//			} else {
//				System.out.println(n + " " + "is not  a perfect number");
//			}
//			
//		}
//		System.out.println("Total Number of Perfect Numbers in given range is :" +count);
//		
		
	}
}
