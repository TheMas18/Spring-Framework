package Basic;

public class ArmstrongNoRange {
	public static void main(String[] args) 
	{
		int total=0;
		for(int m=1;m<=200;m++) 
		{
			int n=m;
			int temp=n;
			int count=countD(n);
			int sum=0;
			while(n!=0) 
			{
				int d=n%10;
				sum=sum+power(d,count);
				n=n/10;
			}
			if(sum==temp) 
			{
				total++;
				System.out.println(temp+" is Armstrong no");
			}		
		}
		System.out.println("-----------------------------");
		System.out.println("Total: "+total);
	}
	private static int power(int d, int count) {
		int fact =1;
		for(int i=1;i<=count;i++) 
		{
			fact=fact*d;
		}
		return fact;
	}
	public static int countD(int n) 
	{
		int count=0;
		while(n!=0) 
		{
			count++;
			n=n/10;
		}
		return count;
	}


}
