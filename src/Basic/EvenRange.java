package Basic;

public class EvenRange {
	public static void main(String[] args) {
		int a=15;
		do {
			if(a%2==0) {
				System.out.println(a);
			}
			a++;
		}
		while(a<=20);
	}

}
