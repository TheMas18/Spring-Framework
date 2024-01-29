package programming;

public class DecimalToOctal {
public static void main(String[] args) {
	int n = 167;
	int temp=n;
	String rev = "";
	
	while (n != 0) {
		int d = n % 8;
		rev=d+rev;
		
		n = n / 8;

	}
	System.out.println("Logic :" + rev);
	System.out.println("Inbuilt Method :"+ Integer.toOctalString(temp));
	
	System.out.println("Octal to Decimal");
	System.out.println("Inbuilt Method :"+ Integer.parseInt(rev, 10));

}
}
