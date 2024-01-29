package Basic;

public class FactorialRange {
	public static void main(String[] args) {
		int fact=1;
		for(int n=1;n<=100;n++) {
			fact=fact*n;
		}
		System.out.println("Factorial:"+fact);
	}

}
