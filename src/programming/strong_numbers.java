package programming;

public class strong_numbers {
	public static void main(String[] args) {
		
		
		
		
		
		
		
//		int n = 145;
//		int temp = n;
//
//		int sum = 0;
//		while (n != 0) {
//			int d = n % 10;// 5
//			int fact = 1;
//			for (int i = 1; i <= d; i++) {
//				fact = fact * i;
//			}
//			sum = sum + fact;
//			n = n / 10;
//		}
//		if (sum == temp) {
//			System.out.println(temp + " " + "Is a Strong Number");
//		} else {
//			System.out.println(temp + " " + "Is Not a Strong Number");
//		}

		// for range
		
		int count=0;
		for(int n=1;n<=1000;n++) {
			int temp = n;
			int sum = 0;
			int flag=temp;
			while (flag >0) {
				int d = flag % 10;// 5
				int fact = 1;
				flag= flag / 10;
				for (int i = 1; i <= d; i++) {
					fact = fact * i;
				}
				sum = sum + fact;
				
			}
			if (sum == temp) {
				count++;
				System.out.println(temp + " " + "Is a Strong Number");
			}
		}
		
		
		
		System.out.println("Total:" +count);
	}
}
