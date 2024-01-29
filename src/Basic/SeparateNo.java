package Basic;

public class SeparateNo {
	public static void main(String[] args) {
		int n=123;
		while(n!=0) {
			int d=n%10;
			System.out.println(d);
			n=n/10;
		}
	}

}
