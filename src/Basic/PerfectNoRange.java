package Basic;
//Doubt
public class PerfectNoRange {
	public static void main(String[] args) {
		int sum=0;
		for(int n=1;n<=100;n++) {
			for(int i=1;i<n;i++) {
				if(n%i==0) {
					sum=sum+i;
				}
			}
			if(sum==n) {
				System.out.println(n+" is Perfect No");
			}
		}
	}
}
