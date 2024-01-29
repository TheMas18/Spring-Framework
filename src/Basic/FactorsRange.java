package Basic;

public class FactorsRange {
	public static void main(String[] args) {
		for(int n=1;n<=100;n++) {
			int count=0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					count++;
					System.out.println("Factors of"+n+":"+i);
				}
			}
			System.out.println("Count:"+count);
			System.out.println("-----------------------");
		}
	}

}
