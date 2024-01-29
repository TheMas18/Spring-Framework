package Basic;

public class FactorialEachNo {
	public static void main(String[] args) {
		int a=1;
		int fact=1;
		while(a<=5) {
			fact*=a;
			System.out.println("Factorial of "+a+":"+fact);
			a++;
		}
	}

}
