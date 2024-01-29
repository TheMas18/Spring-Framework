package programming;

public class prime_number {

	public static void main(String[] args) {
//		int n=5;
//		int  count=0;
//		for(int i=1;i<=n;i++) {
//			if(n%i==0) {
//				count++;
//			}
//		}
//		if(count==2) {
//			System.out.println(n+" is Prime No");
//		}
//		else {
//			System.out.println(count);
//			System.out.println(n+" is Not Prime No");
//		}

		// prime number for range

		int total = 0;

		for (int n = 1; n <= 8; n++) {
			int count = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					count++;
				}

			}
			if (count == 2) {
				total++;
				System.out.println(n + " is Prime No");
			}
		}
		System.out.println("Total No Of Prime Numbers :" + total);

	}
}
