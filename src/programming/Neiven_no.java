package programming;

public class Neiven_no {

	public static void main(String[] args) {

		int n = 12;
		int temp = n;
		int sum = 0;
		while (n != 0) {
			int d = n % 10;
			sum += d;
			n /= 10;
		}
		if (temp % sum == 0) {
			System.out.println("Neiven No" + temp);
		} else {
			System.out.println("not a neiven no" + temp);
		}

//	int count=0;
//	for(int n=1;n<=100;n++) {
//		int i=n;
//		
//		
//		int temp1=i;
//		int sum1=0;
//		
//		while(i!=0) {
//			int d=i%10;
//			sum1+=d;
//			i/=10;
//		}
//		if(temp1%sum1==0) {
//		 count++;
//		
//		}
//	}System.out.println("Total Neiven Numbers from range 1-100 :"+count);
	}
}
