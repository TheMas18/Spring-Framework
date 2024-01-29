
package Basic;

public class NeivenNoRange {
	public static void main(String[] args) {
		int count=0;
		for(int m=1;m<=100;m++) 
		{
			int n=m;
			int temp=n;
			int sum=0;
			while(n!=0) 
			{
				int d=n%10;
				sum=sum+d;
				n=n/10;
			}
			if(temp%sum==0) {
				count++;
				System.out.println(temp+" is neiven no");
			}       
		}
		System.out.println("Total: "+count);
	}
}
