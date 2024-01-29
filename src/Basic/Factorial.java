package Basic;

public class Factorial {
	public static void main(String[] args) {
		int n=1;
		int fact=1;
		while(n<=5) {
			fact*=n;
			n++;
		}
		System.out.println("Factorial:"+fact);
	}

}
