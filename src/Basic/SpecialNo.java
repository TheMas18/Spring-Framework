package Basic;

public class SpecialNo {
	public static void main(String[] args) {
		int n=19;
		int temp=n;
		int sum=0;
		int product=1;
		while(n!=0) {
			int d=n%10;
			sum=sum+d;
			product=product*d;
			n=n/10;
		}
		int a=sum+product;
		if(a==temp) {
			System.out.println(a+" is special no");
		}
	}

}
