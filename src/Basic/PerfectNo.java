package Basic;

public class PerfectNo {
	public static void main(String[] args) {
		int n=6;
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			System.out.println(n+" is Perfect No");
		}
		else
			System.out.println(n+" is not perfect no");
	}

}
