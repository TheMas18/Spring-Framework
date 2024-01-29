package Basic;
//Doubt
public class SpecialNoRange {
	public static void main(String[] args) {
		int sum=0;
		int product=1;
		for(int m=1;m<=100;m++) {
			int n=m;
			int temp=n;
			while(n!=0) {
				int d=n%10;
				sum+=d;
				product*=d;
				n=n/10;
			}
			int result=sum+product;
			if(result==temp) {
				System.out.println(result+" is special no");
			}
		}
	}

}
