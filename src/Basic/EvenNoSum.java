package Basic;

public class EvenNoSum {
	public static void main(String[] args) {
		int n=1;
		int sum=0;
		while(n<=5) {
			if(n%2==0) {
				sum+=n;
			}
			n++;
		}
		System.out.println("Sum of Even No:"+sum);
	}

}
