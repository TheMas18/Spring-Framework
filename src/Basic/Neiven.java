package Basic;

public class Neiven {
	public static void main(String[] args) {
		int n=24;
		int temp=n;
		int sum=0;
		while(n!=0) {
			int d=n%10;
			n=n/10;
			sum=sum+d;
		}
		if(temp%sum==0) {
			System.out.println(temp+" is neiven no");
		}
		else
			System.out.println(temp+" is not neiven no");
	}

}
