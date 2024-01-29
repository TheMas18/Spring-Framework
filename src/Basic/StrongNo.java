package Basic;
//doubt
public class StrongNo {
	public static void main(String[] args) {
		int n=145;
		int temp=n;
		int sum=0;
		int product=1;
		while(n!=0) 
		{
			int d=n%10;
			for(int i=1;i<=d;i++) 
			{
				product=product*d;
			}
			sum+=product;
			n=n/10;
		}
		if(sum==temp) 
		{
			System.out.println(temp+" is Strong no");
		}
		else
			System.out.println(temp+" is not Strong no");
	}

}
